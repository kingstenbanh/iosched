package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class IncludeAgendaContentsBindingImpl extends IncludeAgendaContentsBinding  {

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
    private final android.view.View mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public IncludeAgendaContentsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View[] root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private IncludeAgendaContentsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View[] root, Object[] bindings) {
        super(bindingComponent, root[0], 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[2]
            , (android.support.constraint.Guideline) bindings[0]
            , (android.widget.TextView) bindings[3]
            );
        this.duration.setTag(null);
        this.icon.setTag(null);
        this.keyline.setTag(null);
        this.mboundView1 = (android.view.View) bindings[1];
        this.mboundView1.setTag(null);
        this.title.setTag(null);
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
        if (BR.agenda == variableId) {
            setAgenda((com.google.samples.apps.iosched.shared.model.Block) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAgenda(@Nullable com.google.samples.apps.iosched.shared.model.Block Agenda) {
        this.mAgenda = Agenda;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.agenda);
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
        int agendaStrokeColor = 0;
        com.google.samples.apps.iosched.shared.model.Block agenda = mAgenda;
        int agendaColor = 0;
        java.lang.String agendaType = null;
        java.lang.String agendaTitle = null;
        org.threeten.bp.ZonedDateTime agendaEndTime = null;
        org.threeten.bp.ZonedDateTime agendaStartTime = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (agenda != null) {
                    // read agenda.strokeColor
                    agendaStrokeColor = agenda.getStrokeColor();
                    // read agenda.color
                    agendaColor = agenda.getColor();
                    // read agenda.type
                    agendaType = agenda.getType();
                    // read agenda.title
                    agendaTitle = agenda.getTitle();
                    // read agenda.endTime
                    agendaEndTime = agenda.getEndTime();
                    // read agenda.startTime
                    agendaStartTime = agenda.getStartTime();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.sessiondetail.SessionDetailDataBindingAdaptersKt.timeString(this.duration, agendaStartTime, agendaEndTime);
            com.google.samples.apps.iosched.ui.schedule.agenda.AgendaItemBindingAdapterKt.agendaIcon(this.icon, agendaType);
            com.google.samples.apps.iosched.ui.schedule.agenda.AgendaItemBindingAdapterKt.agendaColor(this.mboundView1, agendaColor, agendaStrokeColor, mboundView1.getResources().getDimension(R.dimen.agenda_item_stroke));
            android.databinding.adapters.TextViewBindingAdapter.setText(this.title, agendaTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): agenda
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}