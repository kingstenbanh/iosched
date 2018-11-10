package com.google.samples.apps.iosched.di;

import java.lang.System;

/**
 * * Main component of the app, created and persisted in the Application class.
 * *
 * * Whenever a new module is created, it should be added to the list of modules.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/google/samples/apps/iosched/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/google/samples/apps/iosched/MainApplication;", "Builder", "mobile_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.google.samples.apps.iosched.di.AppModule.class, com.google.samples.apps.iosched.di.ViewModelModule.class, com.google.samples.apps.iosched.shared.di.SharedModule.class, com.google.samples.apps.iosched.ui.MainModule.class, com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.google.samples.apps.iosched.MainApplication> {
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/google/samples/apps/iosched/di/AppComponent$Builder;", "Ldagger/android/AndroidInjector$Builder;", "Lcom/google/samples/apps/iosched/MainApplication;", "()V", "mobile_debug"})
    @dagger.Component.Builder()
    public static abstract class Builder extends dagger.android.AndroidInjector.Builder<com.google.samples.apps.iosched.MainApplication> {
        
        public Builder() {
            super();
        }
    }
}