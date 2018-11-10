package com.google.samples.apps.iosched.di;

import java.lang.System;

/**
 * * Module used to define the connection between the framework's [ViewModelProvider.Factory] and
 * * our own implementation: [IOSchedViewModelFactory].
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H!\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/google/samples/apps/iosched/di/ViewModelModule;", "", "()V", "bindViewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/google/samples/apps/iosched/di/IOSchedViewModelFactory;", "bindViewModelFactory$mobile_debug", "mobile_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModelProvider.Factory bindViewModelFactory$mobile_debug(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.di.IOSchedViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}