package com.google.samples.apps.iosched.ui.schedule.filters;

import java.lang.System;

/**
 * * Adapter for the filters drawer
 */
@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/ScheduleFilterAdapter;", "Landroid/support/v7/recyclerview/extensions/ListAdapter;", "Lcom/google/samples/apps/iosched/ui/schedule/TagFilter;", "Lcom/google/samples/apps/iosched/ui/schedule/filters/ScheduleFilterAdapter$FilterViewHolder;", "viewModel", "Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;", "(Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;)V", "getViewModel", "()Lcom/google/samples/apps/iosched/ui/schedule/ScheduleViewModel;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "FilterViewHolder", "mobile_debug"})
public final class ScheduleFilterAdapter extends android.support.v7.recyclerview.extensions.ListAdapter<com.google.samples.apps.iosched.ui.schedule.TagFilter, com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterAdapter.FilterViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterAdapter.FilterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.filters.ScheduleFilterAdapter.FilterViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel getViewModel() {
        return null;
    }
    
    public ScheduleFilterAdapter(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u00a2\u0006\u0002\b\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/google/samples/apps/iosched/ui/schedule/filters/ScheduleFilterAdapter$FilterViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "binding", "Lcom/google/samples/apps/iosched/databinding/ListItemFilterDrawerBinding;", "(Lcom/google/samples/apps/iosched/databinding/ListItemFilterDrawerBinding;)V", "bind", "", "filter", "Lcom/google/samples/apps/iosched/ui/schedule/TagFilter;", "bind$mobile_debug", "mobile_debug"})
    public static final class FilterViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        private final com.google.samples.apps.iosched.databinding.ListItemFilterDrawerBinding binding = null;
        
        public final void bind$mobile_debug(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.ui.schedule.TagFilter filter) {
        }
        
        public FilterViewHolder(@org.jetbrains.annotations.NotNull()
        com.google.samples.apps.iosched.databinding.ListItemFilterDrawerBinding binding) {
            super(null);
        }
    }
}