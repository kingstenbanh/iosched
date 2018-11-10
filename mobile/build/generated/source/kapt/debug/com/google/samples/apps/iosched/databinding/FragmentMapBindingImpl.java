package com.google.samples.apps.iosched.databinding;
import com.google.samples.apps.iosched.R;
import com.google.samples.apps.iosched.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMapBindingImpl extends FragmentMapBinding  {

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
    private final android.support.constraint.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMapBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private FragmentMapBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.LinearLayout) bindings[1]
            , (com.google.android.gms.maps.MapView) bindings[2]
            );
        this.appbar.setTag(null);
        this.map.setTag(null);
        this.mboundView0 = (android.support.constraint.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((com.google.samples.apps.iosched.ui.map.MapViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.google.samples.apps.iosched.ui.map.MapViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMarkers((android.arch.lifecycle.LiveData<java.util.List<com.google.android.gms.maps.model.MarkerOptions>>) object, fieldId);
            case 1 :
                return onChangeViewModelMinZoom((android.arch.lifecycle.LiveData<java.lang.Float>) object, fieldId);
            case 2 :
                return onChangeViewModelConferenceLocationBounds((android.arch.lifecycle.LiveData<com.google.android.gms.maps.model.LatLngBounds>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMarkers(android.arch.lifecycle.LiveData<java.util.List<com.google.android.gms.maps.model.MarkerOptions>> ViewModelMarkers, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMinZoom(android.arch.lifecycle.LiveData<java.lang.Float> ViewModelMinZoom, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelConferenceLocationBounds(android.arch.lifecycle.LiveData<com.google.android.gms.maps.model.LatLngBounds> ViewModelConferenceLocationBounds, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        android.arch.lifecycle.LiveData<java.util.List<com.google.android.gms.maps.model.MarkerOptions>> viewModelMarkers = null;
        com.google.android.gms.maps.model.LatLngBounds viewModelConferenceLocationBoundsGetValue = null;
        android.arch.lifecycle.LiveData<java.lang.Float> viewModelMinZoom = null;
        android.arch.lifecycle.LiveData<com.google.android.gms.maps.model.LatLngBounds> viewModelConferenceLocationBounds = null;
        java.lang.Float viewModelMinZoomGetValue = null;
        java.util.List<com.google.android.gms.maps.model.MarkerOptions> viewModelMarkersGetValue = null;
        com.google.samples.apps.iosched.ui.map.MapViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.markers
                        viewModelMarkers = viewModel.getMarkers();
                    }
                    updateLiveDataRegistration(0, viewModelMarkers);


                    if (viewModelMarkers != null) {
                        // read viewModel.markers.getValue()
                        viewModelMarkersGetValue = viewModelMarkers.getValue();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.minZoom
                        viewModelMinZoom = viewModel.getMinZoom();
                    }
                    updateLiveDataRegistration(1, viewModelMinZoom);


                    if (viewModelMinZoom != null) {
                        // read viewModel.minZoom.getValue()
                        viewModelMinZoomGetValue = viewModelMinZoom.getValue();
                    }
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.conferenceLocationBounds
                        viewModelConferenceLocationBounds = viewModel.getConferenceLocationBounds();
                    }
                    updateLiveDataRegistration(2, viewModelConferenceLocationBounds);


                    if (viewModelConferenceLocationBounds != null) {
                        // read viewModel.conferenceLocationBounds.getValue()
                        viewModelConferenceLocationBoundsGetValue = viewModelConferenceLocationBounds.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.map.MapViewBindingAdaptersKt.markers(this.map, viewModelMarkersGetValue);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.map.MapViewBindingAdaptersKt.minZoom(this.map, viewModelMinZoomGetValue);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.map.MapViewBindingAdaptersKt.viewport(this.map, viewModelConferenceLocationBoundsGetValue);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            com.google.samples.apps.iosched.ui.map.MapViewBindingAdaptersKt.isIndoorEnabled(this.map, false);
            com.google.samples.apps.iosched.ui.map.MapViewBindingAdaptersKt.isZoomControlsEnabled(this.map, false);
            com.google.samples.apps.iosched.ui.map.MapViewBindingAdaptersKt.isMapToolbarEnabled(this.map, false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.markers
        flag 1 (0x2L): viewModel.minZoom
        flag 2 (0x3L): viewModel.conferenceLocationBounds
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}