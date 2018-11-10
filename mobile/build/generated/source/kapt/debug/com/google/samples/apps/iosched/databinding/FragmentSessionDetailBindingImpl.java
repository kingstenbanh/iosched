package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSessionDetailBindingImpl extends FragmentSessionDetailBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.session_detail_app_bar, 8);
        sViewsWithIds.put(R.id.detail_image, 9);
        sViewsWithIds.put(R.id.session_detail_toolbar, 10);
        sViewsWithIds.put(R.id.session_detail_scroll_view, 11);
        sViewsWithIds.put(R.id.recorded_icon_image_view, 12);
        sViewsWithIds.put(R.id.guideline_start, 13);
        sViewsWithIds.put(R.id.guideline_end, 14);
        sViewsWithIds.put(R.id.session_detail_recorded, 15);
        sViewsWithIds.put(R.id.session_detail_rate_button, 16);
        sViewsWithIds.put(R.id.session_detail_fab, 17);
    }
    // views
    @NonNull
    private final android.support.design.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSessionDetailBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 18, sIncludes, sViewsWithIds));
    }
    private FragmentSessionDetailBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[9]
            , (android.support.constraint.Guideline) bindings[14]
            , (android.support.constraint.Guideline) bindings[13]
            , (android.support.constraint.ConstraintLayout) bindings[12]
            , (android.support.design.widget.AppBarLayout) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.support.design.widget.FloatingActionButton) bindings[17]
            , (android.widget.Button) bindings[16]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.TextView) bindings[4]
            , (android.support.v4.widget.NestedScrollView) bindings[11]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.support.v7.widget.Toolbar) bindings[10]
            , (android.support.design.widget.CollapsingToolbarLayout) bindings[1]
            );
        this.mboundView0 = (android.support.design.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.sessionDetailDescription.setTag(null);
        this.sessionDetailRoom.setTag(null);
        this.sessionDetailSpeakerList.setTag(null);
        this.sessionDetailTagsContainer.setTag(null);
        this.sessionDetailTime.setTag(null);
        this.sessionDetailTitle.setTag(null);
        this.sessionDetailToolbarLayout.setTag(null);
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
            setViewModel((com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel ViewModel) {
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
                return onChangeViewModelSession((android.arch.lifecycle.LiveData<com.google.samples.apps.iosched.shared.model.Session>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelSession(android.arch.lifecycle.LiveData<com.google.samples.apps.iosched.shared.model.Session> ViewModelSession, int fieldId) {
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
        java.lang.String viewModelSessionRoomName = null;
        android.arch.lifecycle.LiveData<com.google.samples.apps.iosched.shared.model.Session> viewModelSession = null;
        com.google.samples.apps.iosched.shared.model.Session viewModelSessionGetValue = null;
        java.lang.String viewModelSessionAbstract = null;
        com.google.samples.apps.iosched.shared.model.Room viewModelSessionRoom = null;
        java.util.List<com.google.samples.apps.iosched.shared.model.Tag> viewModelSessionTags = null;
        org.threeten.bp.ZonedDateTime viewModelSessionStartTime = null;
        java.lang.String viewModelSessionTitle = null;
        java.util.Set<com.google.samples.apps.iosched.shared.model.Speaker> viewModelSessionSpeakers = null;
        org.threeten.bp.ZonedDateTime viewModelSessionEndTime = null;
        com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.session
                    viewModelSession = viewModel.getSession();
                }
                updateLiveDataRegistration(0, viewModelSession);


                if (viewModelSession != null) {
                    // read viewModel.session.getValue()
                    viewModelSessionGetValue = viewModelSession.getValue();
                }


                if (viewModelSessionGetValue != null) {
                    // read viewModel.session.getValue().abstract
                    viewModelSessionAbstract = viewModelSessionGetValue.getAbstract();
                    // read viewModel.session.getValue().room
                    viewModelSessionRoom = viewModelSessionGetValue.getRoom();
                    // read viewModel.session.getValue().tags
                    viewModelSessionTags = viewModelSessionGetValue.getTags();
                    // read viewModel.session.getValue().startTime
                    viewModelSessionStartTime = viewModelSessionGetValue.getStartTime();
                    // read viewModel.session.getValue().title
                    viewModelSessionTitle = viewModelSessionGetValue.getTitle();
                    // read viewModel.session.getValue().speakers
                    viewModelSessionSpeakers = viewModelSessionGetValue.getSpeakers();
                    // read viewModel.session.getValue().endTime
                    viewModelSessionEndTime = viewModelSessionGetValue.getEndTime();
                }


                if (viewModelSessionRoom != null) {
                    // read viewModel.session.getValue().room.name
                    viewModelSessionRoomName = viewModelSessionRoom.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.sessionDetailDescription, viewModelSessionAbstract);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.sessionDetailRoom, viewModelSessionRoomName);
            com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailDataBindingAdaptersKt.sessionSpeakers(this.sessionDetailSpeakerList, viewModelSessionSpeakers);
            com.google.samples.apps.iosched.ui.schedule.ScheduleBindingAdaptersKt.sessionTags(this.sessionDetailTagsContainer, viewModelSessionTags);
            com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailDataBindingAdaptersKt.timeString(this.sessionDetailTime, viewModelSessionStartTime, viewModelSessionEndTime);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.sessionDetailTitle, viewModelSessionTitle);
            this.sessionDetailToolbarLayout.setTitle(viewModelSessionTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.session
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}