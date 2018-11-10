package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

/**
 * * Module where classes needed to create the [ScheduleFragment] are defined.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\r\u0010\u0007\u001a\u00020\bH!\u00a2\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\u000bH!\u00a2\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u000eH!\u00a2\u0006\u0002\b\u000fJ\r\u0010\u0010\u001a\u00020\u0011H!\u00a2\u0006\u0002\b\u0012\u00a8\u0006\u0013"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/ScheduleModule;", "", "()V", "bindScheduleFragmentViewModel", "Landroid/arch/lifecycle/ViewModel;", "viewModel", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;", "contributeScheduleAgendaFragment", "Lcom/google/samples/apps/iosched/ui/schedule/agenda/ScheduleAgendaFragment;", "contributeScheduleAgendaFragment$mobile_debug", "contributeScheduleDayFragment", "Lcom/google/samples/apps/iosched/ui/schedule/day/ScheduleDayFragment;", "contributeScheduleDayFragment$mobile_debug", "contributeScheduleFilterFragment", "Lcom/google/samples/apps/iosched/ui/schedule/filters/ScheduleFilterFragment;", "contributeScheduleFilterFragment$mobile_debug", "contributeScheduleFragment", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleFragment;", "contributeScheduleFragment$mobile_debug", "mobile_debug"})
@dagger.Module()
public abstract class ScheduleModule {
    
    /**
     * * Generates an [AndroidInjector] for the [ScheduleFragment] as a Dagger subcomponent of the
     *     * [MainModule].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.google.samples.apps.iosched.ui.schedule.ScheduleFragment contributeScheduleFragment$mobile_debug();
    
    /**
     * * Generates an [AndroidInjector] for the [ScheduleDayFragment] as a Dagger subcomponent of the
     *     * [MainModule].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.google.samples.apps.iosched.ui.schedule.day.ScheduleDayFragment contributeScheduleDayFragment$mobile_debug();
    
    /**
     * * Generates an [AndroidInjector] for the [ScheduleAgendaFragment] as a Dagger subcomponent of
     *     * the [MainModule].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.google.samples.apps.iosched.ui.schedule.agenda.ScheduleAgendaFragment contributeScheduleAgendaFragment$mobile_debug();
    
    /**
     * * Generates an [AndroidInjector] for the [ScheduleFilterFragment] as a Dagger subcomponent of
     *     * the [MainModule].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterFragment contributeScheduleFilterFragment$mobile_debug();
    
    /**
     * * The ViewModels are created by Dagger in a map. Via the @ViewModelKey, we define that we
     *     * want to get a [ScheduleViewModel] class.
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.di.ViewModelKey(value = com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel bindScheduleFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel);
    
    public ScheduleModule() {
        super();
    }
}