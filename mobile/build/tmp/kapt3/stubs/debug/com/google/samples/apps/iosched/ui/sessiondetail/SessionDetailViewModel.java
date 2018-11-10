package com.google.samples.apps.iosched.ui.sessiondetail;

import java.lang.System;

/**
 * * Loads [Session] data and exposes it to the session detail view.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/google/samples/apps/iosched/ui/sessiondetail/SessionDetailViewModel;", "Landroid/arch/lifecycle/ViewModel;", "loadSessionUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadSessionUseCase;", "(Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadSessionUseCase;)V", "session", "Landroid/arch/lifecycle/LiveData;", "Lcom/google/samples/apps/iosched/shared/model/Session;", "getSession", "()Landroid/arch/lifecycle/LiveData;", "useCaseResult", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "loadSessionById", "", "sessionId", "", "mobile_debug"})
public final class SessionDetailViewModel extends android.arch.lifecycle.ViewModel {
    private final android.arch.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<com.google.samples.apps.iosched.shared.model.Session>> useCaseResult = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<com.google.samples.apps.iosched.shared.model.Session> session = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.LoadSessionUseCase loadSessionUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.google.samples.apps.iosched.shared.model.Session> getSession() {
        return null;
    }
    
    public final void loadSessionById(@org.jetbrains.annotations.NotNull()
    java.lang.String sessionId) {
    }
    
    @javax.inject.Inject()
    public SessionDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadSessionUseCase loadSessionUseCase) {
        super();
    }
}