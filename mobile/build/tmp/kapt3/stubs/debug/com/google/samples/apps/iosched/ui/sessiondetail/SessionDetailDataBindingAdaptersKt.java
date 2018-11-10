package com.google.samples.apps.iosched.ui.sessiondetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bH\u0007\u001a$\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007\u00a8\u0006\u0012"}, d2 = {"createSessionSpeakerView", "Landroid/view/View;", "container", "Landroid/view/ViewGroup;", "speaker", "Lcom/google/samples/apps/iosched/shared/model/Speaker;", "sessionSpeakers", "", "layout", "Landroid/widget/LinearLayout;", "speakers", "", "timeString", "view", "Landroid/widget/TextView;", "startTime", "Lorg/threeten/bp/ZonedDateTime;", "endTime", "mobile_debug"})
public final class SessionDetailDataBindingAdaptersKt {
    
    @kotlin.Suppress(names = {"unused"})
    @android.databinding.BindingAdapter(value = {"sessionSpeakers"})
    public static final void sessionSpeakers(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout layout, @org.jetbrains.annotations.Nullable()
    java.util.Set<com.google.samples.apps.iosched.shared.model.Speaker> speakers) {
    }
    
    @kotlin.Suppress(names = {"unused"})
    @android.databinding.BindingAdapter(requireAll = true, value = {"startTime", "endTime"})
    public static final void timeString(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    org.threeten.bp.ZonedDateTime startTime, @org.jetbrains.annotations.Nullable()
    org.threeten.bp.ZonedDateTime endTime) {
    }
    
    private static final android.view.View createSessionSpeakerView(android.view.ViewGroup container, com.google.samples.apps.iosched.shared.model.Speaker speaker) {
        return null;
    }
}