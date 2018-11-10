package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

/**
 * * Used as a wrapper for data that is exposed via a LiveData that represents an event.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\r\u0010\b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\n\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\tR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/Event;", "T", "", "content", "hasBeenHandled", "", "(Ljava/lang/Object;Z)V", "Ljava/lang/Object;", "getContentIfNotHandled", "()Ljava/lang/Object;", "peekContent", "mobile_debug"})
public final class Event<T extends java.lang.Object> {
    private final T content = null;
    private boolean hasBeenHandled;
    
    /**
     * * Returns the content and prevents its use again.
     */
    @org.jetbrains.annotations.Nullable()
    public final T getContentIfNotHandled() {
        return null;
    }
    
    /**
     * * Returns the content, even if it's already been handled.
     */
    public final T peekContent() {
        return null;
    }
    
    public Event(T content, boolean hasBeenHandled) {
        super();
    }
}