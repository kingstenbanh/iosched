package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemSpeakerDetailBindingImpl extends ItemSpeakerDetailBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.speaker_item_headshot, 4);
    }
    // views
    @NonNull
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemSpeakerDetailBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemSpeakerDetailBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.speakerItemBio.setTag(null);
        this.speakerItemCompany.setTag(null);
        this.speakerItemName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.speaker == variableId) {
            setSpeaker((com.google.samples.apps.iosched.shared.model.Speaker) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSpeaker(@Nullable com.google.samples.apps.iosched.shared.model.Speaker Speaker) {
        this.mSpeaker = Speaker;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.speaker);
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
        java.lang.String speakerName = null;
        java.lang.String speakerCompany = null;
        com.google.samples.apps.iosched.shared.model.Speaker speaker = mSpeaker;
        java.lang.String speakerAbstract = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (speaker != null) {
                    // read speaker.name
                    speakerName = speaker.getName();
                    // read speaker.company
                    speakerCompany = speaker.getCompany();
                    // read speaker.abstract
                    speakerAbstract = speaker.getAbstract();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.speakerItemBio, speakerAbstract);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.speakerItemCompany, speakerCompany);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.speakerItemName, speakerName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): speaker
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}