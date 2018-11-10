package com.google.samples.app.iosched.shared.data.map

import com.google.android.gms.maps.model.LatLngBounds
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MapMetadataRepository @Inject constructor(
    private val dataSource: MapMetadataDataSource
) {

    fun getConferenceLocationBounds(): LatLngBounds {
        return dataSource.getConferenceLocationBounds()
    }

    fun getMapMinZoom(): Float {
        return dataSource.getMapViewportMinZoom()
    }
}