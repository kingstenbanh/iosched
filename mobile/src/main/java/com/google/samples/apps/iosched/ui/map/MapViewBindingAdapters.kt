/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.iosched.ui.map

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