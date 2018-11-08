package com.google.samples.app.iosched.ui.schedule

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.databinding.ObservableInt
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.result.Result
import com.google.samples.app.iosched.shared.usecases.repository.LoadSessionUseCase

class ScheduleViewModel(loadSessionUseCase: LoadSessionUseCase) : ViewModel() {

    private var _sessions = MutableLiveData<List<Session>>()
    private var _isLoading = MutableLiveData<Boolean>().apply { value = true }

    val sessions: LiveData<List<Session>> get() = _sessions
    val isLoading: LiveData<Boolean> get() = _isLoading

    val numberOfSessions = ObservableInt()

    init {
        loadSessionUseCase.executeAsync("someVar") { result: Result<List<Session>> ->
            when (result) {
                is Result.Success<List<Session>> -> {
                    _sessions.value = result.data
                    numberOfSessions.set(result.data.size)
                    _isLoading.value = false
                }
                is Result.Error -> numberOfSessions.set(0)
                is Result.Loading -> _isLoading.value = true
            }
        }
    }
}