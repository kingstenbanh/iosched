package com.google.samples.app.iosched.ui.sessiondetail

import android.arch.lifecycle.ViewModel
import com.google.samples.app.iosched.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
internal abstract class SessionDetailModule {

    /**
     * Generates an AndroidInjector for the [SessionDetailActivity].
     */
    @ContributesAndroidInjector
    internal abstract fun sessionDetailActivity(): SessionDetailActivity

    /**
     * Generates an AndroidInjector for the [SessionDetailFragment].
     */
    @ContributesAndroidInjector
    internal abstract fun contributeSessionDetailFragment(): SessionDetailFragment

    /**
     * The ViewModels are created by Dagger in a map. Via the @ViewModelKey, we define that we
     * want to get a [SessionDetailViewModel] class.
     */
    @Binds
    @IntoMap
    @ViewModelKey(SessionDetailViewModel::class)
    abstract fun bindSessionDetailFragmentViewModel(viewModel: SessionDetailViewModel): ViewModel
}