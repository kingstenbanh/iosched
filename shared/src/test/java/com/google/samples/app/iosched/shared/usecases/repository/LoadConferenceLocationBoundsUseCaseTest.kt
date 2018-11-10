package com.google.samples.app.iosched.shared.usecases.repository

import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.samples.app.iosched.shared.data.map.MapMetadataDataSource
import com.google.samples.app.iosched.shared.data.map.MapMetadataRepository
import com.google.samples.app.iosched.shared.result.Result
import org.junit.Assert
import org.junit.Test


/**
 * Unit tests for [LoadConferenceLocationBoundsUseCase]
 */
class LoadConferenceLocationBoundsUseCaseTest {

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
    fun returnsConferenceLocationBounds() {
        val useCase = LoadConferenceLocationUseCase(
            MapMetadataRepository(TestMapMetadataDataSource())
        )
        val actualLocation = (useCase.executeNow(Unit)
                as Result.Success<LatLngBounds>).data
        // Expected values to assert
        val expectedLocation = conferenceLocation
        Assert.assertEquals(expectedLocation, actualLocation)
    }

    private inner class TestMapMetadataDataSource : MapMetadataDataSource {
        override fun getConferenceLocationBounds(): LatLngBounds {
            return conferenceLocation
        }
        override fun getMapViewportMinZoom(): Float {
            return mapMinZoom
        }
    }
}