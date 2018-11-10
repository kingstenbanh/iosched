// Generated by Dagger (https://google.github.io/dagger).
package com.google.samples.apps.iosched.di;

import android.content.Context;
import com.google.samples.apps.iosched.MainApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvideContextFactory implements Factory<Context> {
  private final AppModule module;

  private final Provider<MainApplication> applicationProvider;

  public AppModule_ProvideContextFactory(
      AppModule module, Provider<MainApplication> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.provideContext(applicationProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_ProvideContextFactory create(
      AppModule module, Provider<MainApplication> applicationProvider) {
    return new AppModule_ProvideContextFactory(module, applicationProvider);
  }

  public static Context proxyProvideContext(AppModule instance, MainApplication application) {
    return Preconditions.checkNotNull(
        instance.provideContext(application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}