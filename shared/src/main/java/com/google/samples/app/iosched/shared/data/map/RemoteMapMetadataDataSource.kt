package com.google.samples.app.iosched.shared.data.map

import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds

/**
 * TODO: Placeholder
 */
class RemoteMapMetadataDataSource : MapMetadataDataSource {

    private val EVENT_LOCATION_BOUNDS: LatLngBounds by lazy {
        LatLngBounds(LatLng(DEFAULT_VIEWPORT_WEST, DEFAULT_VIEWPORT_NORTH),
            LatLng(DEFAULT_VIEWPORT_EAST, DEFAULT_VIEWPORT_SOUTH)
        )
    }

    private val MAP_VIEWPORT_MIN_ZOOM = 16f

    override fun getConferenceLocationBounds() = EVENT_LOCATION_BOUNDS

    override fun getMapViewportMinZoom() = MAP_VIEWPORT_MIN_ZOOM

    companion object {
        const val DEFAULT_VIEWPORT_WEST = 37.423205
        const val DEFAULT_VIEWPORT_NORTH = -122.081757
        const val DEFAULT_VIEWPORT_EAST = 37.428479
        const val DEFAULT_VIEWPORT_SOUTH = -122.078109
    }
}