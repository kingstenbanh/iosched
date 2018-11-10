package com.google.samples.app.iosched.ui.map

import android.databinding.BindingAdapter
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.MapView
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions

/**
 * Adds list of markers to the GoogleMap.
 */
@BindingAdapter("markers")
fun markers(mapView: MapView, markers: List<MarkerOptions>?) {
    if (markers != null) {
        mapView.getMapAsync { map ->
            markers.forEach { marker ->
                map.addMarker(marker)
            }
        }
    }
}

/**
 * Sets the map viewport to a specific rectangle specified by two Latitude/Longitude points.
 */
@BindingAdapter("viewport")
fun viewport(mapView: MapView, bounds: LatLngBounds?) {
    if (bounds != null) {
        mapView.getMapAsync {
            it.setLatLngBoundsForCameraTarget(bounds)
        }
    }
}

/**
 * Sets the center of the map's camera target. This will be called initially and then every time the
 * user selects an event or a marker.
 */
@BindingAdapter(value = ["centerTarget", "zoomLevel"], requireAll = true)
fun cameraTarget(mapView: MapView, target: LatLng?, zoomLevel: Float?) {
    if (target != null && zoomLevel != null) {
        mapView.getMapAsync {
            it.animateCamera(CameraUpdateFactory.newLatLngZoom(target, zoomLevel))
        }
    }
}

/**
 * Sets the minimum zoom level of the map (how far out the user is allowed to zoom).
 */
@BindingAdapter("minZoom")
fun minZoom(mapView: MapView, minZoom: Float?) {
    if (minZoom != null) {
        mapView.getMapAsync {
            it.setMinZoomPreference(minZoom)
        }
    }
}

@BindingAdapter("isIndoorEnabled")
fun isIndoorEnabled(mapView: MapView, isIndoorEnabled: Boolean?) {
    if (isIndoorEnabled != null) {
        mapView.getMapAsync {
            it.isIndoorEnabled = isIndoorEnabled
        }
    }
}

@BindingAdapter("isZoomControlsEnabled")
fun isZoomControlsEnabled(mapView: MapView, isZoomControlsEnabled: Boolean?) {
    if (isZoomControlsEnabled != null) {
        mapView.getMapAsync {
            it.uiSettings.isZoomControlsEnabled = isZoomControlsEnabled
        }
    }
}

@BindingAdapter("isMapToolbarEnabled")
fun isMapToolbarEnabled(mapView: MapView, isMapToolbarEnabled: Boolean?) {
    if (isMapToolbarEnabled != null) {
        mapView.getMapAsync {
            it.uiSettings.isMapToolbarEnabled = isMapToolbarEnabled
        }
    }
}
