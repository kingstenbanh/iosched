package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&\u00a8\u0006\f"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/ScheduleEventListener;", "", "clearFilters", "", "openSessionDetail", "id", "", "toggleFilter", "filter", "Lcom/google/samples/apps/iosched/ui/schedule/TagFilter;", "enabled", "", "mobile_debug"})
public abstract interface ScheduleEventListener {
    
    public abstract void openSessionDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    public abstract void toggleFilter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.TagFilter filter, boolean enabled);
    
    public abstract void clearFilters();
}