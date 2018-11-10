package com.google.samples.apps.iosched.ui;

import java.lang.System;

/**
 * * Module that defines the builder for the [MainActivity].
 * *
 * * Each activity in the app will have its own module. This is called "MainModule" because it
 * * belongs to the "MainActivity".
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010\u0003\u001a\u00020\u0004H!\u00a2\u0006\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/google/samples/apps/iosched/ui/MainModule;", "", "()V", "mainActivity", "Lcom/google/samples/apps/iosched/ui/MainActivity;", "mainActivity$mobile_debug", "mobile_debug"})
@dagger.Module()
public abstract class MainModule {
    
    /**
     * * Define in the modules list all other modules that are part of the MainActivity.
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector(modules = {com.google.samples.apps.iosched.ui.schedule.ScheduleModule.class, com.google.samples.apps.iosched.ui.map.MapModule.class, com.google.samples.apps.iosched.ui.info.InfoModule.class})
    public abstract com.google.samples.apps.iosched.ui.MainActivity mainActivity$mobile_debug();
    
    public MainModule() {
        super();
    }
}