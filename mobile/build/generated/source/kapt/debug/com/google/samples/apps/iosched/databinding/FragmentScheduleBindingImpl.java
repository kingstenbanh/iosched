package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentScheduleBindingImpl extends FragmentScheduleBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 3);
        sViewsWithIds.put(R.id.title, 4);
        sViewsWithIds.put(R.id.tabs, 5);
    }
    // views
    @NonNull
    private final android.support.design.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentScheduleBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentScheduleBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.support.design.widget.AppBarLayout) bindings[3]
            , (android.widget.ProgressBar) bindings[2]
            , (android.support.design.widget.TabLayout) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.support.v4.view.ViewPager) bindings[1]
            );
        this.loading.setTag(null);
        this.mboundView0 = (android.support.design.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.viewpager.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsLoading((android.arch.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(android.arch.lifecycle.LiveData<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
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
        boolean androidDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = false;
        android.arch.lifecycle.LiveData<java.lang.Boolean> viewModelIsLoading = null;
        java.lang.Boolean viewModelIsLoadingGetValue = null;
        com.google.samples.apps.iosched.ui.schedule.ScheduleViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.isLoading
                    viewModelIsLoading = viewModel.isLoading();
                }
                updateLiveDataRegistration(0, viewModelIsLoading);


                if (viewModelIsLoading != null) {
                    // read viewModel.isLoading.getValue()
                    viewModelIsLoadingGetValue = viewModelIsLoading.getValue();
                }


                // read android.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.getValue())
                androidDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue = android.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGetValue);
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.util.ViewBindingAdaptersKt.goneUnless(this.loading, androidDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGetValue);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.schedule.ScheduleBindingAdaptersKt.pageMargin(this.viewpager, viewpager.getResources().getDimension(R.dimen.spacing_normal));
            this.viewpager.setPageMarginDrawable(getDrawableFromResource(viewpager, R.drawable.page_margin));
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isLoading
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}