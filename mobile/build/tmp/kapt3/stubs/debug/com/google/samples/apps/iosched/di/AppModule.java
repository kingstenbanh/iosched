package com.google.samples.apps.iosched.di;

import java.lang.System;

/**
 * * Defines all the classes that need to be provided in the scope of the app.
 * *
 * * Define here all objects that are shared throughout the app, like SharedPreferences, navigators or
 * * others. If some of those objects are singletons, they should be annotated with `@Singleton`.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/google/samples/apps/iosched/di/AppModule;", "", "()V", "provideContext", "Landroid/content/Context;", "application", "Lcom/google/samples/apps/iosched/MainApplication;", "mobile_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.MainApplication application) {
        return null;
    }
    
    public AppModule() {
        super();
    }
}