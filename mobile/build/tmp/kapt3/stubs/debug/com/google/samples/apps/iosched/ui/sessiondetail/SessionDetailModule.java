package com.google.samples.apps.iosched.ui.sessiondetail;

import java.lang.System;

/**
 * * Module where classes needed to create the [SessionDetailFragment] are defined.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\r\u0010\u0007\u001a\u00020\bH!\u00a2\u0006\u0002\b\tJ\r\u0010\n\u001a\u00020\u000bH!\u00a2\u0006\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailModule;", "", "()V", "bindSessionDetailFragmentViewModel", "Landroid/arch/lifecycle/ViewModel;", "viewModel", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewModel;", "contributeSessionDetailFragment", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailFragment;", "contributeSessionDetailFragment$mobile_debug", "sessionDetailActivity", "Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailActivity;", "sessionDetailActivity$mobile_debug", "mobile_debug"})
@dagger.Module()
public abstract class SessionDetailModule {
    
    /**
     * * Generates an AndroidInjector for the [SessionDetailActivity].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailActivity sessionDetailActivity$mobile_debug();
    
    /**
     * * Generates an AndroidInjector for the [SessionDetailFragment].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailFragment contributeSessionDetailFragment$mobile_debug();
    
    /**
     * * The ViewModels are created by Dagger in a map. Via the @ViewModelKey, we define that we
     *     * want to get a [SessionDetailViewModel] class.
     */
    @org.jetbrains.annotations.NotNull()
    @com.google.samples.apps.iosched.di.ViewModelKey(value = com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel bindSessionDetailFragmentViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel viewModel);
    
    public SessionDetailModule() {
        super();
    }
}