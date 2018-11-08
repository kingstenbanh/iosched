package com.google.samples.app.iosched.util

import com.google.samples.app.iosched.shared.usecases.internal.DefaultScheduler
import com.google.samples.app.iosched.shared.usecases.internal.SyncScheduler
import org.junit.rules.TestWatcher
import org.junit.runner.Description

class SyncTaskExecutorRule: TestWatcher() {
    override fun starting(description: Description?) {
        super.starting(description)
        DefaultScheduler.setDelegate(SyncScheduler)
    }

    override fun finished(description: Description?) {
        super.finished(description)
        DefaultScheduler.setDelegate(null)
    }
}