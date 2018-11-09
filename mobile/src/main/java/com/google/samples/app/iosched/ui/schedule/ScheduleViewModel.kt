package com.google.samples.app.iosched.ui.schedule

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.result.Result
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay.DAY_1
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay.DAY_2
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay.DAY_3
import com.google.samples.app.iosched.shared.util.TimeUtils.ConferenceDay.PRECONFERENCE_DAY
import javax.inject.Inject

class ScheduleViewModel @Inject constructor(
    private val loadSessionsByDayUseCase: LoadSessionsByDayUseCase
) : ViewModel() {

    private var filters = SessionFilters()

    lateinit var isLoading: LiveData<Boolean>

    val errorMessage: LiveData<String>
    val errorMessageShown = MutableLiveData<Boolean>()

    private val useCaseResult = MutableLiveData<Result<Map<ConferenceDay, List<Session>>>>()
    private val preconferenceSessions: LiveData<List<Session>>
    private val day1Sessions: LiveData<List<Session>>
    private val day2Sessions: LiveData<List<Session>>
    private val day3Sessions: LiveData<List<Session>>

    init {
        loadSessionsByDayUseCase.executeAsync(filters, useCaseResult)

        // map LiveData results from UseCase to each day's individual LiveData
        preconferenceSessions = Transformations.map(useCaseResult) { result ->
            (result as? Result.Success)?.data?.get(PRECONFERENCE_DAY) ?: emptyList()
        }
        day1Sessions = Transformations.map(useCaseResult) { result ->
            (result as? Result.Success)?.data?.get(DAY_1) ?: emptyList()
        }
        day2Sessions = Transformations.map(useCaseResult) { result ->
            (result as? Result.Success)?.data?.get(DAY_2) ?: emptyList()
        }
        day3Sessions = Transformations.map(useCaseResult) { result ->
            (result as? Result.Success)?.data?.get(DAY_3) ?: emptyList()
        }
        isLoading = Transformations.map(useCaseResult) { result -> result == Result.Loading }

        errorMessage = Transformations.map(useCaseResult) { result ->
            errorMessageShown.value = false
            (result as? Result.Error)?.exception?.message ?: ""
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
        loadSessionsByDayUseCase.executeAsync(filters, useCaseResult)
    }
}