package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0000R\u0011\u0010\u0004\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/TagFilter;", "", "tag", "Lcom/google/samples/apps/iosched/shared/model/Tag;", "isChecked", "", "(Lcom/google/samples/apps/iosched/shared/model/Tag;Z)V", "Landroid/databinding/ObservableBoolean;", "()Landroid/databinding/ObservableBoolean;", "getTag", "()Lcom/google/samples/apps/iosched/shared/model/Tag;", "equals", "other", "hashCode", "", "isUiContentEqual", "mobile_debug"})
public final class TagFilter {
    @org.jetbrains.annotations.NotNull()
    private final android.databinding.ObservableBoolean isChecked = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.shared.model.Tag tag = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.databinding.ObservableBoolean isChecked() {
        return null;
    }
    
    /**
     * Only the tag is used for equality. 
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    /**
     * Only the tag is used for equality. 
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public final boolean isUiContentEqual(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.TagFilter other) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.shared.model.Tag getTag() {
        return null;
    }
    
    public TagFilter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.model.Tag tag, boolean isChecked) {
        super();
    }
}