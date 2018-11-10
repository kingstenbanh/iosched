package com.google.samples.app.iosched.tv.ui.schedule

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.google.samples.app.iosched.shared.data.session.SessionRepository
import com.google.samples.app.iosched.shared.usecases.repository.LoadSessionsUseCase

class ScheduleViewModelFactory(
    private val sessionRepository: SessionRepository
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ScheduleViewModel::class.java)) {
            return ScheduleViewModel(LoadSessionsUseCase(sessionRepository)) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}