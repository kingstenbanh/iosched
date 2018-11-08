package com.google.samples.app.iosched.ui.schedule

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.google.samples.app.iosched.shared.data.session.DefaultSessionRepository
import com.google.samples.app.iosched.shared.usecases.repository.LoadSessionUseCase

/**
 * Creates [ScheduleViewModel]s, used with the [android.arch.lifecycle.ViewModelProviders].
 */
class ScheduleViewModelFactory : ViewModelProvider.Factory {

    private val repository = DefaultSessionRepository

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ScheduleViewModel::class.java)) {
            return ScheduleViewModel(LoadSessionUseCase(repository)) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}