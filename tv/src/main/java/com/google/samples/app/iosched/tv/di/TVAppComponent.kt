package com.google.samples.app.iosched.tv.di

import com.google.samples.app.iosched.shared.di.SharedModule
import com.google.samples.app.iosched.tv.TVApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * Main component of the app, created and persisted in the Application class.
 *
 * Whenever a new module is created, it should be added to the list of modules.
 */
@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        TVAppModule::class,
        SharedModule::class
    ]
)
interface TVAppComponent : AndroidInjector<TVApplication> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<TVApplication>()
}