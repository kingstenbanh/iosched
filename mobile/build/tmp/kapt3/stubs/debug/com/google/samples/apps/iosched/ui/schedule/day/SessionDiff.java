package com.google.samples.apps.iosched.ui.schedule.day;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/day/SessionDiff;", "Landroid/support/v7/util/DiffUtil$ItemCallback;", "Lcom/google/samples/apps/iosched/shared/model/Session;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "mobile_debug"})
public final class SessionDiff extends android.support.v7.util.DiffUtil.ItemCallback<com.google.samples.apps.iosched.shared.model.Session> {
    public static final com.google.samples.apps.iosched.ui.schedule.day.SessionDiff INSTANCE = null;
    
    @java.lang.Override()
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.model.Session oldItem, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.model.Session newItem) {
        return false;
    }
    
    @java.lang.Override()
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.model.Session oldItem, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.model.Session newItem) {
        return false;
    }
    
    private SessionDiff() {
        super();
    }
}