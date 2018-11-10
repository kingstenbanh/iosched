package com.google.samples.app.iosched.tv.ui.schedule

import com.google.samples.app.iosched.tv.di.TvScheduleModule
import dagger.Subcomponent

/**
 * Schedule component for the tv app, created and persisted in the [Injector] singleton.
 */
@Subcomponent(modules = [TvScheduleModule::class])
interface TvScheduleComponent {

    fun scheduleViewModelFactory(): ScheduleViewModelFactory

    fun inject(scheduleFragment: ScheduleFragment)
}