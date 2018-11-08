package com.google.samples.app.iosched.ui.sessiondetail

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

class SessionDetailViewModelFactory(
    private val sessionId: String
): ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SessionDetailViewModel(sessionId) as T
    }
}