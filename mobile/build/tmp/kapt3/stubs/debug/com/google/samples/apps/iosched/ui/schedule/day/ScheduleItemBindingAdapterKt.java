package com.google.samples.apps.iosched.ui.schedule.day;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0001H\u0007\u00a8\u0006\u000e"}, d2 = {"durationString", "", "context", "Landroid/content/Context;", "duration", "Lorg/threeten/bp/Duration;", "sessionLengthLocation", "", "textView", "Landroid/widget/TextView;", "startTime", "Lorg/threeten/bp/ZonedDateTime;", "endTime", "room", "mobile_debug"})
public final class ScheduleItemBindingAdapterKt {
    
    @android.databinding.BindingAdapter(requireAll = true, value = {"sessionStart", "sessionEnd", "sessionRoom"})
    public static final void sessionLengthLocation(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime startTime, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime endTime, @org.jetbrains.annotations.NotNull()
    java.lang.String room) {
    }
    
    private static final java.lang.String durationString(android.content.Context context, org.threeten.bp.Duration duration) {
        return null;
    }
}