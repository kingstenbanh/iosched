package com.google.samples.app.iosched.tv.di

import com.google.samples.app.iosched.shared.di.SharedModule
import com.google.samples.app.iosched.tv.ui.schedule.TvScheduleComponent

/**
 * Singleton instance responsible for providing the Dagger object graph and injection to fragments
 * and activities.
 *
 * To use in a fragment, get the appropriate component and call the inject method
 *
 * ```
 * override fun onCreate(savedInstanceState: Bundle?) {
 *   super.onCreate(savedInstanceState)
 *   Injector.appComponent.inject(this)
 *   ...
 * }
 * ```
 */
object Injector {

    private val appComponent: TvAppComponent by lazy {
        DaggerTvAppComponent.builder()
            .tvAppModule(TvAppModule())
            .sharedModule(SharedModule())
            .build()
    }

    val scheduleComponent: TvScheduleComponent by lazy {
        appComponent.plus(TvScheduleModule())
    }
}