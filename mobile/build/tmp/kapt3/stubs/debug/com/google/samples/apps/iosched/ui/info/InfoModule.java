package com.google.samples.apps.iosched.ui.info;

import java.lang.System;

/**
 * * Module where classes needed to create the [InfoFragment] are defined.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H!\u00a2\u0006\u0002\b\u0005J\r\u0010\u0006\u001a\u00020\u0007H!\u00a2\u0006\u0002\b\bJ\r\u0010\t\u001a\u00020\nH!\u00a2\u0006\u0002\b\u000bJ\r\u0010\f\u001a\u00020\rH!\u00a2\u0006\u0002\b\u000eJ\r\u0010\u000f\u001a\u00020\u0010H!\u00a2\u0006\u0002\b\u0011\u00a8\u0006\u0012"}, d2 = {"Lcom/google/samples/apps/iosched/ui/info/InfoModule;", "", "()V", "contributeEventFragment", "Lcom/google/samples/apps/iosched/ui/info/EventFragment;", "contributeEventFragment$mobile_debug", "contributeFaqFragment", "Lcom/google/samples/apps/iosched/ui/info/FaqFragment;", "contributeFaqFragment$mobile_debug", "contributeInfoFragment", "Lcom/google/samples/apps/iosched/ui/info/InfoFragment;", "contributeInfoFragment$mobile_debug", "contributeSettingsFragment", "Lcom/google/samples/apps/iosched/ui/info/SettingsFragment;", "contributeSettingsFragment$mobile_debug", "contributeTravelFragment", "Lcom/google/samples/apps/iosched/ui/info/TravelFragment;", "contributeTravelFragment$mobile_debug", "mobile_debug"})
@dagger.Module()
public abstract class InfoModule {
    
    /**
     * * Generates an [AndroidInjector] for the [InfoFragment] as a Dagger subcomponent of the
     *     * [MainModule].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.google.samples.apps.iosched.ui.info.InfoFragment contributeInfoFragment$mobile_debug();
    
    /**
     * * Generates an [AndroidInjector] for the [EventFragment] as a Dagger subcomponent of the
     *     * [MainModule].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.google.samples.apps.iosched.ui.info.EventFragment contributeEventFragment$mobile_debug();
    
    /**
     * * Generates an [AndroidInjector] for the [TravelFragment] as a Dagger subcomponent of the
     *     * [MainModule].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.google.samples.apps.iosched.ui.info.TravelFragment contributeTravelFragment$mobile_debug();
    
    /**
     * * Generates an [AndroidInjector] for the [FaqFragment] as a Dagger subcomponent of the
     *     * [MainModule].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.google.samples.apps.iosched.ui.info.FaqFragment contributeFaqFragment$mobile_debug();
    
    /**
     * * Generates an [AndroidInjector] for the [SettingsFragment] as a Dagger subcomponent of the
     *     * [MainModule].
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.google.samples.apps.iosched.ui.info.SettingsFragment contributeSettingsFragment$mobile_debug();
    
    public InfoModule() {
        super();
    }
}