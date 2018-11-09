package com.google.samples.app.iosched.tv.ui.schedule

import android.arch.lifecycle.ViewModel
import com.google.samples.app.iosched.shared.data.session.DefaultSessionRepository
import android.arch.lifecycle.ViewModelProvider
import com.google.samples.app.iosched.shared.usecases.repository.LoadSessionsUseCase

class ScheduleViewModelFactory : ViewModelProvider.Factory {

    private val repository = DefaultSessionRepository

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ScheduleViewModel::class.java)) {
            return ScheduleViewModel(LoadSessionsUseCase(repository)) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
