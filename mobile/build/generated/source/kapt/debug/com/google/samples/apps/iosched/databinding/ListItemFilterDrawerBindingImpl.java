package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemFilterDrawerBindingImpl extends ListItemFilterDrawerBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemFilterDrawerBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ListItemFilterDrawerBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.CheckedTextView) bindings[1]
            );
        this.filterLabel.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.tagFilter == variableId) {
            setTagFilter((com.google.samples.apps.iosched.ui.schedule.TagFilter) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTagFilter(@Nullable com.google.samples.apps.iosched.ui.schedule.TagFilter TagFilter) {
        this.mTagFilter = TagFilter;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.tagFilter);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeTagFilterIsChecked((android.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeTagFilterIsChecked(android.databinding.ObservableBoolean TagFilterIsChecked, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int tagFilterTagColor = 0;
        boolean tagFilterIsCheckedGet = false;
        java.lang.String tagFilterTagName = null;
        android.databinding.ObservableBoolean tagFilterIsChecked = null;
        com.google.samples.apps.iosched.ui.schedule.TagFilter tagFilter = mTagFilter;
        com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel = mViewModel;
        com.google.samples.apps.iosched.shared.model.Tag tagFilterTag = null;

        if ((dirtyFlags & 0xbL) != 0) {



                if (tagFilter != null) {
                    // read tagFilter.isChecked
                    tagFilterIsChecked = tagFilter.isChecked();
                }
                updateRegistration(0, tagFilterIsChecked);


                if (tagFilterIsChecked != null) {
                    // read tagFilter.isChecked.get()
                    tagFilterIsCheckedGet = tagFilterIsChecked.get();
                }
            if ((dirtyFlags & 0xaL) != 0) {

                    if (tagFilter != null) {
                        // read tagFilter.tag
                        tagFilterTag = tagFilter.getTag();
                    }


                    if (tagFilterTag != null) {
                        // read tagFilter.tag.color
                        tagFilterTagColor = tagFilterTag.getColor();
                        // read tagFilter.tag.name
                        tagFilterTagName = tagFilterTag.getName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.filterLabel.setChecked(tagFilterIsCheckedGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.filterLabel.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.filterLabel, tagFilterTagName);
            com.google.samples.apps.iosched.ui.schedule.ScheduleBindingAdaptersKt.tagColor(this.filterLabel, tagFilterTagColor);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // tagFilter
        com.google.samples.apps.iosched.ui.schedule.TagFilter tagFilter = mTagFilter;
        // !tagFilter.isChecked.get()
        boolean filterLabelChecked = false;
        // viewModel
        com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;
        // tagFilter.isChecked.get()
        boolean tagFilterIsCheckedGet = false;
        // tagFilter != null
        boolean tagFilterJavaLangObjectNull = false;
        // tagFilter.isChecked != null
        boolean tagFilterIsCheckedJavaLangObjectNull = false;
        // tagFilter.isChecked
        android.databinding.ObservableBoolean tagFilterIsChecked = null;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {




            tagFilterJavaLangObjectNull = (tagFilter) != (null);
            if (tagFilterJavaLangObjectNull) {


                tagFilterIsChecked = tagFilter.isChecked();

                tagFilterIsCheckedJavaLangObjectNull = (tagFilterIsChecked) != (null);
                if (tagFilterIsCheckedJavaLangObjectNull) {


                    tagFilterIsCheckedGet = tagFilterIsChecked.get();

                    filterLabelChecked = !tagFilterIsCheckedGet;

                    viewModel.toggleFilter(tagFilter, filterLabelChecked);
                }
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tagFilter.isChecked
        flag 1 (0x2L): tagFilter
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}