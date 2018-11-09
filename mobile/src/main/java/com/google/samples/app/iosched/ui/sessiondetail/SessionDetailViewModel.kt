package com.google.samples.app.iosched.ui.sessiondetail

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Transformations
import android.arch.lifecycle.ViewModel
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.result.Result
import com.google.samples.app.iosched.shared.usecases.repository.LoadSessionUseCase
import com.google.samples.app.iosched.shared.util.TimeUtils
import com.google.samples.app.iosched.shared.util.map
import javax.inject.Inject

class SessionDetailViewModel @Inject constructor(
    private val loadSessionUseCase: LoadSessionUseCase
): ViewModel() {

    val useCaseResult = MutableLiveData<Result<Session>>()
    val session: LiveData<Session?>
    val timeString: LiveData<String>

    init {
        session = useCaseResult.map { result ->
            (result as? Result.Success)?.data
        }

        timeString = Transformations.map(session) { currentSession ->
            if (currentSession == null) {
                ""
            } else {
                TimeUtils.timeString(currentSession.startTime, currentSession.endTime)
            }

        }
    }

    fun loadSessionById(sessionId: String) {
        loadSessionUseCase.executeAsync(sessionId, useCaseResult)
    }
}