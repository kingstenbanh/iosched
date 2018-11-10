package com.google.samples.apps.iosched.ui.schedule.agenda;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a \u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0007\u001a\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007\"\u0016\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"agendaTimePattern", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "agendaColor", "", "view", "Landroid/view/View;", "fillColor", "", "strokeColor", "strokeWidth", "", "agendaDuration", "textView", "Landroid/widget/TextView;", "startTime", "Lorg/threeten/bp/ZonedDateTime;", "endTime", "agendaIcon", "imageView", "Landroid/widget/ImageView;", "type", "", "mobile_debug"})
public final class AgendaItemBindingAdapterKt {
    private static final org.threeten.bp.format.DateTimeFormatter agendaTimePattern = null;
    
    @android.databinding.BindingAdapter(requireAll = true, value = {"agendaColor", "agendaStrokeColor", "agendaStrokeWidth"})
    public static final void agendaColor(@org.jetbrains.annotations.NotNull()
    android.view.View view, int fillColor, int strokeColor, float strokeWidth) {
    }
    
    @android.databinding.BindingAdapter(value = {"agendaIcon"})
    public static final void agendaIcon(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
    }
    
    @android.databinding.BindingAdapter(requireAll = true, value = {"startTime", "endTime"})
    public static final void agendaDuration(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime startTime, @org.jetbrains.annotations.NotNull()
    org.threeten.bp.ZonedDateTime endTime) {
    }
}