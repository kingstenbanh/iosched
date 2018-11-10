package com.google.samples.app.iosched.shared.usecases.repository

import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.samples.app.iosched.shared.data.map.MapMetadataDataSource
import com.google.samples.app.iosched.shared.data.map.MapMetadataRepository
import com.google.samples.app.iosched.shared.result.Result
import org.junit.Assert
import org.junit.Test

/**
 * Unit tests for [LoadConferenceMinZoomUseCaseTest]
 */
class LoadConferenceMinZoomUseCaseTest {

    private val conferenceLocationBoundsWest = 37.423205
    private val conferenceLocationBoundsNorth = -122.081757
    private val conferenceLocationBoundsEast = 37.428479
    private val conferenceLocationBoundsSouth = -122.078109
    private val conferenceLocation = LatLngBounds(
        LatLng(conferenceLocationBoundsWest, conferenceLocationBoundsNorth),
        LatLng(conferenceLocationBoundsEast, conferenceLocationBoundsSouth)
    )
    private val mapMinZoom = 12f

    @Test
    fun returnsMapMinZoom() {
        val useCase = LoadConferenceMinZoomUseCase(MapMetadataRepository(TestMapMetadataDataSource()))
        val actualZoom = (useCase.executeNow(Unit)
            as Result.Success<Float>).data

        // Expected values to assert
        val expectedZoom = mapMinZoom

        Assert.assertEquals(expectedZoom, actualZoom)
    }

    private inner class TestMapMetadataDataSource: MapMetadataDataSource {
        override fun getConferenceLocationBounds(): LatLngBounds {
            return conferenceLocation
        }

        override fun getMapViewportMinZoom(): Float {
            return mapMinZoom
        }

    }

}