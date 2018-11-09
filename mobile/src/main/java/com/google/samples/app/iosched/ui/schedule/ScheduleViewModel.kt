package com.google.samples.app.iosched.ui.schedule

import android.arch.lifecycle.LiveData
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

    private lateinit var preconferenceSessions: LiveData<List<Session>>
    private lateinit var day1Sessions: LiveData<List<Session>>
    private lateinit var day2Sessions: LiveData<List<Session>>
    private lateinit var day3Sessions: LiveData<List<Session>>

    init {
        loadSessions()
    }

    private fun loadSessions() {
        val liveResult = loadSessionsByDayUseCase.executeAsync(filters)

        // map LiveData results from UseCase to each day's individual LiveData
        preconferenceSessions = Transformations.map(liveResult) { result ->
            (result as? Result.Success)?.data?.get(PRECONFERENCE_DAY) ?: emptyList()
        }
        day1Sessions = Transformations.map(liveResult) { result ->
            (result as? Result.Success)?.data?.get(DAY_1) ?: emptyList()
        }
        day2Sessions = Transformations.map(liveResult) { result ->
            (result as? Result.Success)?.data?.get(DAY_2) ?: emptyList()
        }
        day3Sessions = Transformations.map(liveResult) { result ->
            (result as? Result.Success)?.data?.get(DAY_3) ?: emptyList()
        }
        isLoading = Transformations.map(liveResult) { result -> result == Result.Loading }
    }

    fun getSessionsForDay(day: ConferenceDay): LiveData<List<Session>> = when (day) {
        PRECONFERENCE_DAY -> preconferenceSessions
        DAY_1 -> day1Sessions
        DAY_2 -> day2Sessions
        DAY_3 -> day3Sessions
    }

    fun applyFilter(filters: SessionFilters) {
        this.filters = filters
        loadSessions()
    }
}