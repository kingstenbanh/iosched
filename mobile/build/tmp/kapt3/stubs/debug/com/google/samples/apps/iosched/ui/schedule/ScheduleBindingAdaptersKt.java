package com.google.samples.apps.iosched.ui.schedule;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a\u0018\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u001a\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0012H\u0007\u001a \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00142\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0015H\u0007\u001a\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0007\u001a\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0007\u001a\u0016\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d\u00a8\u0006\u001e"}, d2 = {"createSessionTagButton", "Landroid/widget/Button;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "sessionTag", "Lcom/google/samples/apps/iosched/shared/model/Tag;", "drawableCompat", "Landroid/graphics/drawable/Drawable;", "view", "Landroid/view/View;", "id", "", "pageMargin", "", "viewPager", "Landroid/support/v4/view/ViewPager;", "", "sessionTags", "Landroid/widget/LinearLayout;", "", "tagColor", "textView", "Landroid/widget/TextView;", "color", "tagTint", "tagTintOrDefault", "context", "Landroid/content/Context;", "mobile_debug"})
public final class ScheduleBindingAdaptersKt {
    
    @android.databinding.BindingAdapter(value = {"sessionTags"})
    public static final void sessionTags(@org.jetbrains.annotations.NotNull()
    android.widget.LinearLayout container, @org.jetbrains.annotations.Nullable()
    java.util.List<com.google.samples.apps.iosched.shared.model.Tag> sessionTags) {
    }
    
    private static final android.widget.Button createSessionTagButton(android.view.LayoutInflater inflater, android.view.ViewGroup container, com.google.samples.apps.iosched.shared.model.Tag sessionTag) {
        return null;
    }
    
    @android.databinding.BindingAdapter(value = {"tagTint"})
    public static final void tagTint(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, int color) {
    }
    
    /**
     * * Creates a tag background with checkable state. When checked, the tag becomes filled and shows a
     * * clear ('X') icon in place of the dot.
     */
    @android.databinding.BindingAdapter(value = {"tagColor"})
    public static final void tagColor(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, int color) {
    }
    
    public static final int tagTintOrDefault(int color, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final android.graphics.drawable.Drawable drawableCompat(@org.jetbrains.annotations.NotNull()
    android.view.View view, int id) {
        return null;
    }
    
    @android.databinding.BindingAdapter(value = {"pageMargin"})
    public static final void pageMargin(@org.jetbrains.annotations.NotNull()
    android.support.v4.view.ViewPager viewPager, float pageMargin) {
    }
}