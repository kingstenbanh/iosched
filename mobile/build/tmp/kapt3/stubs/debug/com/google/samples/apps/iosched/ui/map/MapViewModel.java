package com.google.samples.apps.iosched.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00120\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/google/samples/apps/iosched/ui/map/MapViewModel;", "Landroid/arch/lifecycle/ViewModel;", "loadConferenceLocationUseCase", "Lcom/google/samples/apps/iosched/shared/domain/map/LoadConferenceLocationUseCase;", "loadConferenceMinZoomUseCase", "Lcom/google/samples/apps/iosched/shared/domain/map/LoadConferenceMinZoomUseCase;", "(Lcom/google/samples/apps/iosched/shared/domain/map/LoadConferenceLocationUseCase;Lcom/google/samples/apps/iosched/shared/domain/map/LoadConferenceMinZoomUseCase;)V", "conferenceLocationBounds", "Landroid/arch/lifecycle/LiveData;", "Lcom/google/android/gms/maps/model/LatLngBounds;", "getConferenceLocationBounds", "()Landroid/arch/lifecycle/LiveData;", "errorMessageShown", "Landroid/arch/lifecycle/MutableLiveData;", "", "getErrorMessageShown", "()Landroid/arch/lifecycle/MutableLiveData;", "markers", "", "Lcom/google/android/gms/maps/model/MarkerOptions;", "getMarkers", "minZoom", "", "getMinZoom", "mobile_debug"})
public final class MapViewModel extends android.arch.lifecycle.ViewModel {
    
    /**
     * * Markers for key locations on map (i.e. sessions, code labs, food, bathrooms, etc.)
     */
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.util.List<com.google.android.gms.maps.model.MarkerOptions>> markers = null;
    
    /**
     * * Area covered by the venue. Determines the viewport of the map.
     */
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<com.google.android.gms.maps.model.LatLngBounds> conferenceLocationBounds = null;
    
    /**
     * * Min zoom level for map.
     */
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<java.lang.Float> minZoom = null;
    
    /**
     * * True if any errors occur in fetching the data.
     */
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> errorMessageShown = null;
    private final com.google.samples.apps.iosched.shared.domain.map.LoadConferenceLocationUseCase loadConferenceLocationUseCase = null;
    private final com.google.samples.apps.iosched.shared.domain.map.LoadConferenceMinZoomUseCase loadConferenceMinZoomUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.util.List<com.google.android.gms.maps.model.MarkerOptions>> getMarkers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<com.google.android.gms.maps.model.LatLngBounds> getConferenceLocationBounds() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<java.lang.Float> getMinZoom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Boolean> getErrorMessageShown() {
        return null;
    }
    
    @javax.inject.Inject()
    public MapViewModel(@org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.map.LoadConferenceLocationUseCase loadConferenceLocationUseCase, @org.jetbrains.annotations.NotNull()
    com.google.samples.apps.iosched.shared.domain.map.LoadConferenceMinZoomUseCase loadConferenceMinZoomUseCase) {
        super();
    }
}