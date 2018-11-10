package com.google.samples.apps.iosched.ui.schedule.day;

import java.lang.System;

/**
 * * A [RecyclerView.ItemDecoration] which draws sticky headers for a given list of sessions.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/day/ScheduleTimeHeadersDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "sessions", "", "Lcom/google/samples/apps/iosched/shared/model/Session;", "(Landroid/content/Context;Ljava/util/List;)V", "hourFormatter", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "meridiemFormatter", "meridiemTextSize", "", "paddingTop", "paint", "Landroid/text/TextPaint;", "timeSlots", "", "Landroid/text/StaticLayout;", "width", "createHeader", "startTime", "Lorg/threeten/bp/ZonedDateTime;", "onDrawOver", "", "c", "Landroid/graphics/Canvas;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "mobile_debug"})
public final class ScheduleTimeHeadersDecoration extends android.support.v7.widget.RecyclerView.ItemDecoration {
    private final android.text.TextPaint paint = null;
    private final int width = 0;
    private final int paddingTop = 0;
    private final int meridiemTextSize = 0;
    private final org.threeten.bp.format.DateTimeFormatter hourFormatter = null;
    private final org.threeten.bp.format.DateTimeFormatter meridiemFormatter = null;
    private final java.util.Map<java.lang.Integer, android.text.StaticLayout> timeSlots = null;
    
    /**
     * * Loop over each child and draw any corresponding headers i.e. items who's position is a key in
     *     * [timeSlots]. We also look back to see if there are any headers _before_ the first header we
     *     * found i.e. which needs to be sticky.
     */
    @java.lang.Override()
    public void onDrawOver(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.State state) {
    }
    
    /**
     * * Create a header layout for the given [startTime]
     */
    private final android.text.StaticLayout createHeader(org.threeten.bp.ZonedDateTime startTime) {
        return null;
    }
    
    public ScheduleTimeHeadersDecoration(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.shared.model.Session> sessions) {
        super();
    }
}