package com.google.samples.apps.iosched.ui.schedule.agenda;

import java.lang.System;

/**
 * * A [RecyclerView.ItemDecoration] which draws sticky headers marking the days in a given list of
 * * [Block]s. It also inserts gaps & a dividing line between days.
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J(\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J \u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\'2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016R\u0016\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/agenda/ScheduleAgendaHeadersDecoration;", "Landroid/support/v7/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "blocks", "", "Lcom/google/samples/apps/iosched/shared/model/Block;", "(Landroid/content/Context;Ljava/util/List;)V", "dateFormatter", "Lorg/threeten/bp/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "dateTextSize", "", "dayFormatter", "daySlots", "", "Landroid/text/StaticLayout;", "dividerPaint", "Landroid/graphics/Paint;", "margin", "padding", "textPaint", "Landroid/text/TextPaint;", "width", "createHeader", "day", "Lorg/threeten/bp/ZonedDateTime;", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroid/support/v7/widget/RecyclerView;", "state", "Landroid/support/v7/widget/RecyclerView$State;", "onDraw", "c", "Landroid/graphics/Canvas;", "mobile_debug"})
public final class ScheduleAgendaHeadersDecoration extends android.support.v7.widget.RecyclerView.ItemDecoration {
    private final android.text.TextPaint textPaint = null;
    private final android.graphics.Paint dividerPaint = null;
    private final int width = 0;
    private final int padding = 0;
    private final int margin = 0;
    private final org.threeten.bp.format.DateTimeFormatter dayFormatter = null;
    private final org.threeten.bp.format.DateTimeFormatter dateFormatter = null;
    private final int dateTextSize = 0;
    private final java.util.Map<java.lang.Integer, android.text.StaticLayout> daySlots = null;
    
    /**
     * *  Add gaps between days, split over the last and first block of a day.
     */
    @java.lang.Override()
    public void getItemOffsets(@org.jetbrains.annotations.NotNull()
    android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.State state) {
    }
    
    /**
     * * Loop over each child and draw any corresponding headers i.e. items who's position is a key in
     *     * [daySlots]. We also look back to see if there are any headers _before_ the first header we
     *     * found i.e. which needs to be sticky.
     */
    @java.lang.Override()
    public void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas c, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView.State state) {
    }
    
    /**
     * * Create a header layout for the given [day]
     */
    private final android.text.StaticLayout createHeader(org.threeten.bp.ZonedDateTime day) {
        return null;
    }
    
    public ScheduleAgendaHeadersDecoration(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.samples.apps.iosched.shared.model.Block> blocks) {
        super();
    }
}