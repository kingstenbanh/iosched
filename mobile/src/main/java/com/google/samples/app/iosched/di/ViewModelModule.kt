package com.google.samples.app.iosched.di

import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

/**
 * Module used to define the connection between the framework's [ViewModelProvider.Factory] and
 * our own implementation: [IOSchedViewModelFactory].
 */
@Module
internal abstract class ViewModelModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: IOSchedViewModelFactory)
        : ViewModelProvider.Factory
}