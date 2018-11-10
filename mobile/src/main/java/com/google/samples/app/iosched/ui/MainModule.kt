package com.google.samples.app.iosched.ui

import com.google.samples.app.iosched.ui.map.MapModule
import com.google.samples.app.iosched.ui.schedule.ScheduleModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Module that defines the builder for the [MainActivity].
 *
 * Each activity in the app will have its own module. This is called "MainModule" because it
 * belongs to the "MainActivity".
 */
@Module
internal abstract class MainModule {

    /**
     * Define in the modules list all other modules that are part of the MainActivity.
     */
    // TODO: add in modules MapModule, FeedModule etc.
    @ContributesAndroidInjector(modules = [
        ScheduleModule::class,
        MapModule::class
    ])
    internal abstract fun mainActivity(): MainActivity
}