package com.google.samples.apps.iosched.ui.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 10}, bv = {1, 0, 2}, k = 2, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u001a\u001f\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u001a \u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0007\u001a\u001f\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0007\u00a2\u0006\u0002\u0010\u0012\u001a\u001a\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0007\u00a8\u0006\u0016"}, d2 = {"cameraTarget", "", "mapView", "Lcom/google/android/gms/maps/MapView;", "target", "Lcom/google/android/gms/maps/model/LatLng;", "zoomLevel", "", "(Lcom/google/android/gms/maps/MapView;Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/Float;)V", "isIndoorEnabled", "", "(Lcom/google/android/gms/maps/MapView;Ljava/lang/Boolean;)V", "isMapToolbarEnabled", "isZoomControlsEnabled", "markers", "", "Lcom/google/android/gms/maps/model/MarkerOptions;", "minZoom", "(Lcom/google/android/gms/maps/MapView;Ljava/lang/Float;)V", "viewport", "bounds", "Lcom/google/android/gms/maps/model/LatLngBounds;", "mobile_debug"})
public final class MapViewBindingAdaptersKt {
    
    /**
     * * Adds list of markers to the GoogleMap.
     */
    @android.databinding.BindingAdapter(value = {"markers"})
    public static final void markers(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.MapView mapView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.google.android.gms.maps.model.MarkerOptions> markers) {
    }
    
    /**
     * * Sets the map viewport to a specific rectangle specified by two Latitude/Longitude points.
     */
    @android.databinding.BindingAdapter(value = {"viewport"})
    public static final void viewport(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.MapView mapView, @org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLngBounds bounds) {
    }
    
    /**
     * * Sets the center of the map's camera target. This will be called initially and then every time the
     * * user selects an event or a marker.
     */
    @android.databinding.BindingAdapter(requireAll = true, value = {"centerTarget", "zoomLevel"})
    public static final void cameraTarget(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.MapView mapView, @org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.model.LatLng target, @org.jetbrains.annotations.Nullable()
    java.lang.Float zoomLevel) {
    }
    
    /**
     * * Sets the minimum zoom level of the map (how far out the user is allowed to zoom).
     */
    @android.databinding.BindingAdapter(value = {"minZoom"})
    public static final void minZoom(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.MapView mapView, @org.jetbrains.annotations.Nullable()
    java.lang.Float minZoom) {
    }
    
    @android.databinding.BindingAdapter(value = {"isIndoorEnabled"})
    public static final void isIndoorEnabled(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.MapView mapView, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isIndoorEnabled) {
    }
    
    @android.databinding.BindingAdapter(value = {"isZoomControlsEnabled"})
    public static final void isZoomControlsEnabled(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.MapView mapView, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isZoomControlsEnabled) {
    }
    
    @android.databinding.BindingAdapter(value = {"isMapToolbarEnabled"})
    public static final void isMapToolbarEnabled(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.MapView mapView, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isMapToolbarEnabled) {
    }
}