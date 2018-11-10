package com.google.samples.app.iosched.tv.di

import com.google.samples.app.iosched.shared.data.session.SessionRepository
import com.google.samples.app.iosched.tv.ui.schedule.ScheduleViewModelFactory
import dagger.Module
import dagger.Provides

/**
 * Provides Dagger with dependencies for the [ScheduleFragment].
 */
@Module
class TvScheduleModule {

    @Provides
    fun provideScheduleViewModelFactory(sessionRepository: SessionRepository)
        : ScheduleViewModelFactory {
        return ScheduleViewModelFactory(sessionRepository)
    }
}