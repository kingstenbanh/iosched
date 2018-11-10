package com.google.samples.app.iosched.tv.di

import com.google.samples.app.iosched.shared.di.SharedModule
import com.google.samples.app.iosched.tv.ui.schedule.TvScheduleComponent
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

/**
 * Main component of the tv app, created and persisted in the [Injector] singleton.
 *
 * Whenever a [Subcomponent] is created, a new method should be added to the interface.
 */
@Singleton
@Component(modules = [SharedModule::class, TvAppModule::class])
interface TvAppComponent {

    fun plus(scheduleModule: TvScheduleModule): TvScheduleComponent
}