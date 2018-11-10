package com.google.samples.app.iosched.ui.schedule

import android.arch.lifecycle.ViewModel
import com.google.samples.app.iosched.di.ViewModelKey
import com.google.samples.app.iosched.ui.schedule.agenda.ScheduleAgendaFragment
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
    internal abstract fun contributeScheduleFragment(): ScheduleFragment

    /**
     * Generates an [AndroidInjector] for the [ScheduleDayFragment] as a Dagger subcomponent of the
     * [MainModule].
     */
    @ContributesAndroidInjector
    internal abstract fun contributeScheduleDayFragment(): ScheduleDayFragment

    /**
     * Generates an [AndroidInjector] for the [ScheduleAgendaFragment] as a Dagger subcomponent of
     * the [MainModule].
     */
    @ContributesAndroidInjector
    internal abstract fun contributeScheduleAgendaFragment(): ScheduleAgendaFragment

    /**
     * Generates an [AndroidInjector] for the [ScheduleFilterFragment] as a Dagger subcomponent of
     * the [MainModule].
     */
    @ContributesAndroidInjector
    internal abstract fun contributeScheduleFilterFragment(): ScheduleFilterFragment

    /**
     * The ViewModels are created by Dagger in a map. Via the @ViewModelKey, we define that we
     * want to get a [ScheduleViewModel] class.
     */
    @Binds
    @IntoMap
    @ViewModelKey(ScheduleViewModel::class)
    abstract fun bindScheduleFragmentViewModel(viewModel: ScheduleViewModel): ViewModel
}