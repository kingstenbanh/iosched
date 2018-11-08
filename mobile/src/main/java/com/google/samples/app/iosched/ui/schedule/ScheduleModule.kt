package com.google.samples.app.iosched.ui.schedule

import android.arch.lifecycle.ViewModel
import com.google.samples.app.iosched.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

/**
 * Module where classes needed to create the [ScheduleFragment] are defined.
 */
@Module
internal abstract class ScheduleModule {

    /**
     * Generates an [AndroidInjector] for the [ScheduleFragment] as a Dagger subcomponent of the
     * [MainModule].
     */
    @ContributesAndroidInjector
    internal abstract fun showDetailsFragment(): ScheduleFragment

    /**
     * The ViewModels are created by Dagger in a map. Via the @ViewModelKey, we define that we
     * want to get a [ScheduleViewModel] class.
     */
    @Binds
    @IntoMap
    @ViewModelKey(ScheduleViewModel::class)
    abstract fun bindScheduleFragmentViewModel(viewModel: ScheduleViewModel): ViewModel
}