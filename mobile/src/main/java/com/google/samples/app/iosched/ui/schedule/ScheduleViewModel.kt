package com.google.samples.app.iosched.ui.schedule

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.model.Tag
import com.google.samples.app.iosched.shared.result.Result
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay.DAY_1
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay.DAY_2
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay.DAY_3
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay.PRECONFERENCE_DAY
import timber.log.Timber
import javax.inject.Inject

class ScheduleViewModel @Inject constructor(
    private val loadSessionsByDayUseCase: LoadSessionsByDayUseCase,
    private val loadTagsByCategoryUseCase: LoadTagsByCategoryUseCase
) : ViewModel(), ScheduleEventListener {

    private var filters = SessionFilters()

    var isLoading: LiveData<Boolean>

    val errorMessage: LiveData<String>
    val errorMessageShown = MutableLiveData<Boolean>()

    private val loadSessionResult = MutableLiveData<Result<Map<ConferenceDay, List<Session>>>>()
    private val loadTagsResult = MutableLiveData<Result<List<Tag>>>()

    private val preconferenceSessions: LiveData<List<Session>>
    private val day1Sessions: LiveData<List<Session>>
    private val day2Sessions: LiveData<List<Session>>
    private val day3Sessions: LiveData<List<Session>>

    val tags: LiveData<List<Tag>>

    init {
        loadSessionsByDayUseCase.executeAsync(filters, loadSessionResult)
        loadTagsByCategoryUseCase.executeAsync(Unit, loadTagsResult)

        // map LiveData results from UseCase to each day's individual LiveData
        preconferenceSessions = Transformations.map(loadSessionResult) { result ->
            (result as? Result.Success)?.data?.get(PRECONFERENCE_DAY) ?: emptyList()
        }
        day1Sessions = Transformations.map(loadSessionResult) { result ->
            (result as? Result.Success)?.data?.get(DAY_1) ?: emptyList()
        }
        day2Sessions = Transformations.map(loadSessionResult) { result ->
            (result as? Result.Success)?.data?.get(DAY_2) ?: emptyList()
        }
        day3Sessions = Transformations.map(loadSessionResult) { result ->
            (result as? Result.Success)?.data?.get(DAY_3) ?: emptyList()
        }
        isLoading = Transformations.map(loadSessionResult) { result -> result == Result.Loading }

        errorMessage = Transformations.map(loadSessionResult) { result ->
            errorMessageShown.value = false
            (result as? Result.Error)?.exception?.message ?: ""
        }

        tags = Transformations.map(loadTagsResult) { result ->
            (result as? Result.Success)?.data ?: emptyList()
        }
    }

    fun wasErrorMessageShown(): Boolean = errorMessageShown.value ?: false

    fun onErrorMessageShown() { errorMessageShown.value = true }

    fun getSessionsForDay(day: ConferenceDay): LiveData<List<Session>> = when (day) {
        PRECONFERENCE_DAY -> preconferenceSessions
        DAY_1 -> day1Sessions
        DAY_2 -> day2Sessions
        DAY_3 -> day3Sessions
    }

    fun applyFilter(filters: SessionFilters) {
        this.filters = filters
        loadSessionsByDayUseCase.executeAsync(filters, loadSessionResult)
    }

    override fun openSessionDetail(id: String) {
        Timber.d("TODO: Open session detail for id: $id")
    }
}

interface ScheduleEventListener {
    fun openSessionDetail(id: String)
}