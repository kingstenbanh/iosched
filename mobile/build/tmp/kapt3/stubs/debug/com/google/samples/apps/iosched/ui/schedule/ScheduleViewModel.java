package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

/**
 * * Loads data and exposes it to the view.
 * * By annotating the constructor with [@Inject], Dagger will use that constructor when needing to
 * * create the object, so defining a [@Provides] method for this class won't be needed.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u00101\u001a\u000202H\u0016J\u001a\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000b2\u0006\u00104\u001a\u00020\'J\u0010\u00105\u001a\u0002022\u0006\u00106\u001a\u00020\u0019H\u0016J!\u00107\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\f\u00108\u001a\b\u0012\u0004\u0012\u00020)0\fH\u0001\u00a2\u0006\u0002\b9J\u0018\u0010:\u001a\u0002022\u0006\u0010;\u001a\u00020\u00112\u0006\u0010<\u001a\u00020!H\u0016R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000fR \u0010\"\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0$0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010%\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\f0&0$0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\f0$0#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180#\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u000e\u0010-\u001a\u00020.X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u000f\u00a8\u0006="}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;", "Landroid/arch/lifecycle/ViewModel;", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleEventListener;", "loadSessionsByDayUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadSessionsByDayUseCase;", "loadAgendaUseCase", "Lcom/google/samples/apps/iosched/shared/domain/agenda/LoadAgendaUseCase;", "loadTagsByCategoryUseCase", "Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadTagsByCategoryUseCase;", "(Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadSessionsByDayUseCase;Lcom/google/samples/apps/iosched/shared/domain/agenda/LoadAgendaUseCase;Lcom/google/samples/apps/iosched/shared/domain/sessions/LoadTagsByCategoryUseCase;)V", "agenda", "Landroid/arch/lifecycle/LiveData;", "", "Lcom/google/samples/apps/iosched/shared/model/Block;", "getAgenda", "()Landroid/arch/lifecycle/LiveData;", "cachedTagFilters", "Lcom/google/samples/apps/iosched/ui/schedule/TagFilter;", "day1Sessions", "Lcom/google/samples/apps/iosched/shared/model/Session;", "day2Sessions", "day3Sessions", "errorMessage", "Landroid/arch/lifecycle/MediatorLiveData;", "Lcom/google/samples/apps/iosched/ui/schedule/Event;", "", "getErrorMessage", "()Landroid/arch/lifecycle/MediatorLiveData;", "hasAnyFilters", "Landroid/databinding/ObservableBoolean;", "getHasAnyFilters", "()Landroid/databinding/ObservableBoolean;", "isLoading", "", "loadAgendaResult", "Landroid/arch/lifecycle/MutableLiveData;", "Lcom/google/samples/apps/iosched/shared/result/Result;", "loadSessionsResult", "", "Lcom/google/samples/apps/iosched/shared/util/TimeUtils$ConferenceDay;", "loadTagsResult", "Lcom/google/samples/apps/iosched/shared/model/Tag;", "navigateToSessionAction", "getNavigateToSessionAction", "()Landroid/arch/lifecycle/MutableLiveData;", "sessionMatcher", "Lcom/google/samples/apps/iosched/shared/schedule/SessionMatcher;", "tagFilters", "getTagFilters", "clearFilters", "", "getSessionsForDay", "day", "openSessionDetail", "id", "processTags", "tags", "processTags$mobile_debug", "toggleFilter", "filter", "enabled", "mobile_debug"})
public final class ScheduleViewModel extends android.arch.lifecycle.ViewModel implements com.google.samples.apps.iosched.ui.schedule.ScheduleEventListener {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.lang.Boolean> isLoading = null;
    private final com.google.samples.apps.iosched.shared.schedule.SessionMatcher sessionMatcher = null;
    private java.util.List<com.google.samples.apps.iosched.ui.schedule.TagFilter> cachedTagFilters;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.schedule.TagFilter>> tagFilters = null;
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean hasAnyFilters = null;
    private final android.arch.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.util.Map<com.google.samples.apps.iosched.shared.util.TimeUtils.ConferenceDay, java.util.List<com.google.samples.apps.iosched.shared.model.Session>>>> loadSessionsResult = null;
    private final android.arch.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.util.List<com.google.samples.apps.iosched.shared.model.Block>>> loadAgendaResult = null;
    private final android.arch.lifecycle.MutableLiveData<com.google.samples.apps.iosched.shared.result.Result<java.util.List<com.google.samples.apps.iosched.shared.model.Tag>>> loadTagsResult = null;
    private final android.arch.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.shared.model.Session>> day1Sessions = null;
    private final android.arch.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.shared.model.Session>> day2Sessions = null;
    private final android.arch.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.shared.model.Session>> day3Sessions = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.shared.model.Block>> agenda = null;
    
    /**
     * LiveData for Actions and Events 
     */
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.ui.schedule.Event<java.lang.String>> errorMessage = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<com.google.samples.apps.iosched.ui.schedule.Event<java.lang.String>> navigateToSessionAction = null;
    private final com.google.samples.apps.iosched.shared.domain.sessions.LoadSessionsByDayUseCase loadSessionsByDayUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.ui.schedule.TagFilter>> getTagFilters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean getHasAnyFilters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.shared.model.Block>> getAgenda() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MediatorLiveData<com.google.samples.apps.iosched.ui.schedule.Event<java.lang.String>> getErrorMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<com.google.samples.apps.iosched.ui.schedule.Event<java.lang.String>> getNavigateToSessionAction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.support.annotation.VisibleForTesting()
    public final java.util.List<com.google.samples.apps.iosched.ui.schedule.TagFilter> processTags$mobile_debug(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.shared.model.Tag> tags) {
        return null;
    }
    
    /**
     * * Called from each schedule day fragment to load data.
     */
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.google.samples.apps.iosched.shared.model.Session>> getSessionsForDay(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.util.TimeUtils.ConferenceDay day) {
        return null;
    }
    
    /**
     * * Called from UI to start a navigation action to the detail screen.
     */
    @java.lang.Override()
    public void openSessionDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    /**
     * * Called from the UI to enable or disable the filters.
     */
    @java.lang.Override()
    public void toggleFilter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.TagFilter filter, boolean enabled) {
    }
    
    /**
     * * Called from the UI to reset the filters.
     */
    @java.lang.Override()
    public void clearFilters() {
    }
    
    @javax.inject.Inject()
    public ScheduleViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadSessionsByDayUseCase loadSessionsByDayUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.agenda.LoadAgendaUseCase loadAgendaUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.sessions.LoadTagsByCategoryUseCase loadTagsByCategoryUseCase) {
        super();
    }
}