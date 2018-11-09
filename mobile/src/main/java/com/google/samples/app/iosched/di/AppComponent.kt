package com.google.samples.app.iosched.di

import com.google.samples.app.iosched.shared.di.SharedModule
import com.google.samples.app.iosched.MainApplication
import com.google.samples.app.iosched.ui.MainModule
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
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ViewModelModule::class,
    SharedModule::class,
    MainModule::class
])
interface AppComponent: AndroidInjector<MainApplication> {

    @Component.Builder
    abstract class Builder: AndroidInjector.Builder<MainApplication>()
}
