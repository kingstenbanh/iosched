// Generated by Dagger (https://google.github.io/dagger).
package com.google.samples.apps.iosched.ui.sessiondetail;

import com.google.samples.apps.iosched.shared.domain.sessions.LoadSessionUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class SessionDetailViewModel_Factory implements Factory<SessionDetailViewModel> {
  private final Provider<LoadSessionUseCase> loadSessionUseCaseProvider;

  public SessionDetailViewModel_Factory(Provider<LoadSessionUseCase> loadSessionUseCaseProvider) {
    this.loadSessionUseCaseProvider = loadSessionUseCaseProvider;
  }

  @Override
  public SessionDetailViewModel get() {
    return new SessionDetailViewModel(loadSessionUseCaseProvider.get());
  }

  public static SessionDetailViewModel_Factory create(
      Provider<LoadSessionUseCase> loadSessionUseCaseProvider) {
    return new SessionDetailViewModel_Factory(loadSessionUseCaseProvider);
  }
}