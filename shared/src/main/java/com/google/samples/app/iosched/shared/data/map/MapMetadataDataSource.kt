package com.google.samples.app.iosched.shared.data.map

import com.google.android.gms.maps.model.LatLngBounds

interface MapMetadataDataSource {
    /**
     * Returns the latitude/longitude bounds of the conference
     */
    fun getConferenceLocationBounds(): LatLngBounds

    /**
     * Keeping as API because this depends on the size of the conference, which is dynamic
     */
    fun getMapViewportMinZoom(): Float
}