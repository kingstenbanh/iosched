package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSessionBindingImpl extends ItemSessionBinding implements com.google.samples.apps.iosched.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.keyline, 4);
        sViewsWithIds.put(R.id.overflow, 5);
        sViewsWithIds.put(R.id.tags_container, 6);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSessionBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ItemSessionBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.constraint.Guideline) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.HorizontalScrollView) bindings[6]
            , (android.widget.TextView) bindings[1]
            );
        this.lengthLocation.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tags.setTag(null);
        this.title.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.google.samples.apps.iosched.generated.callback.OnClickListener(this, 1);
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
        if (BR.session == variableId) {
            setSession((com.google.samples.apps.iosched.shared.model.Session) variable);
        }
        else if (BR.eventListener == variableId) {
            setEventListener((com.google.samples.apps.iosched.ui.schedule.ScheduleEventListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSession(@Nullable com.google.samples.apps.iosched.shared.model.Session Session) {
        this.mSession = Session;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.session);
        super.requestRebind();
    }
    public void setEventListener(@Nullable com.google.samples.apps.iosched.ui.schedule.ScheduleEventListener EventListener) {
        this.mEventListener = EventListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.eventListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String sessionRoomName = null;
        org.threeten.bp.ZonedDateTime sessionEndTime = null;
        com.google.samples.apps.iosched.shared.model.Room sessionRoom = null;
        org.threeten.bp.ZonedDateTime sessionStartTime = null;
        com.google.samples.apps.iosched.shared.model.Session session = mSession;
        java.lang.String sessionTitle = null;
        com.google.samples.apps.iosched.ui.schedule.ScheduleEventListener eventListener = mEventListener;
        java.util.List<com.google.samples.apps.iosched.shared.model.Tag> sessionTags = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (session != null) {
                    // read session.endTime
                    sessionEndTime = session.getEndTime();
                    // read session.room
                    sessionRoom = session.getRoom();
                    // read session.startTime
                    sessionStartTime = session.getStartTime();
                    // read session.title
                    sessionTitle = session.getTitle();
                    // read session.tags
                    sessionTags = session.getTags();
                }


                if (sessionRoom != null) {
                    // read session.room.name
                    sessionRoomName = sessionRoom.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.schedule.day.ScheduleItemBindingAdapterKt.sessionLengthLocation(this.lengthLocation, sessionStartTime, sessionEndTime, sessionRoomName);
            com.google.samples.apps.iosched.ui.schedule.ScheduleBindingAdaptersKt.sessionTags(this.tags, sessionTags);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, sessionTitle);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // session.id
        java.lang.String sessionId = null;
        // eventListener
        com.google.samples.apps.iosched.ui.schedule.ScheduleEventListener eventListener = mEventListener;
        // session
        com.google.samples.apps.iosched.shared.model.Session session = mSession;
        // eventListener != null
        boolean eventListenerJavaLangObjectNull = false;
        // session != null
        boolean sessionJavaLangObjectNull = false;



        eventListenerJavaLangObjectNull = (eventListener) != (null);
        if (eventListenerJavaLangObjectNull) {



            sessionJavaLangObjectNull = (session) != (null);
            if (sessionJavaLangObjectNull) {


                sessionId = session.getId();

                eventListener.openSessionDetail(sessionId);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): session
        flag 1 (0x2L): eventListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}