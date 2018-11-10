package com.google.samples.app.iosched.ui.schedule

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.google.samples.app.iosched.shared.model.Block
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.model.Tag
import com.google.samples.app.iosched.shared.result.Result
import com.google.samples.app.iosched.shared.usecases.invoke
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay.DAY_1
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay.DAY_2
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay.DAY_3
import com.google.samples.app.iosched.shared.util.map
import com.google.samples.app.iosched.ui.schedule.agenda.LoadAgendaUseCase
import timber.log.Timber
import javax.inject.Inject

class ScheduleViewModel @Inject constructor(
    private val loadSessionsByDayUseCase: LoadSessionsByDayUseCase,
    loadAgendaUseCase: LoadAgendaUseCase,
    loadTagsByCategoryUseCase: LoadTagsByCategoryUseCase
) : ViewModel(), ScheduleEventListener {

    private var filters = SessionFilters()

    var isLoading: LiveData<Boolean>

    val tags: LiveData<List<Tag>>

    val errorMessage: LiveData<String>
    val errorMessageShown = MutableLiveData<Boolean>()

    private val loadSessionsResult = MutableLiveData<Result<Map<ConferenceDay, List<Session>>>>()
    private val loadAgendaResult = MutableLiveData<Result<List<Block>>>()
    private val loadTagsResult = MutableLiveData<Result<List<Tag>>>()

    private val day1Sessions: LiveData<List<Session>>
    private val day2Sessions: LiveData<List<Session>>
    private val day3Sessions: LiveData<List<Session>>

    val agenda: LiveData<List<Block>>

    init {
        // Load sessions and tags and store the result in `LiveData`s
        loadSessionsByDayUseCase(filters, loadSessionsResult)
        loadAgendaUseCase(loadAgendaResult)
        loadTagsByCategoryUseCase(loadTagsResult)

        // map LiveData results from UseCase to each day's individual LiveData
        day1Sessions = loadSessionsResult.map {
            (it as? Result.Success)?.data?.get(DAY_1) ?: emptyList()
        }
        day2Sessions = loadSessionsResult.map {
            (it as? Result.Success)?.data?.get(DAY_2) ?: emptyList()
        }
        day3Sessions = loadSessionsResult.map {
            (it as? Result.Success)?.data?.get(DAY_3) ?: emptyList()
        }
        isLoading = loadSessionsResult.map { it == Result.Loading }

        errorMessage = loadSessionsResult.map { result ->
            errorMessageShown.value = false
            (result as? Result.Error)?.exception?.message ?: ""
        }

        agenda = loadAgendaResult.map {
            (it as? Result.Success)?.data ?: emptyList()
        }
        // TODO handle agenda errors

        tags = loadTagsResult.map { result ->
            (result as? Result.Success)?.data ?: emptyList()
        }
    }

    fun wasErrorMessageShown(): Boolean = errorMessageShown.value ?: false

    fun onErrorMessageShown() { errorMessageShown.value = true }

    fun getSessionsForDay(day: ConferenceDay): LiveData<List<Session>> = when (day) {
        DAY_1 -> day1Sessions
        DAY_2 -> day2Sessions
        DAY_3 -> day3Sessions
        else -> throw IllegalStateException("Unknown day")
    }

    override fun openSessionDetail(id: String) {
        Timber.d("TODO: Open session detail for id: $id")
    }

    override fun toggleFilter(tag: Tag, enabled: Boolean) {
        if (enabled) {
            filters.add(tag)
        } else {
            filters.remove(tag)
        }
        loadSessionsByDayUseCase(filters, loadSessionsResult)
    }

    override fun clearFilters() {
        filters.clearAll()
        loadSessionsByDayUseCase(filters, loadSessionsResult)
    }
}

interface ScheduleEventListener {
    fun openSessionDetail(id: String)
    fun toggleFilter(tag: Tag, enabled: Boolean)
    fun clearFilters()
}