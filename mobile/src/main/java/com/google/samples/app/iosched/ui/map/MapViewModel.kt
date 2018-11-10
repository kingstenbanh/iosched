package com.google.samples.app.iosched.ui.map

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions
import com.google.samples.app.iosched.shared.result.Result
import com.google.samples.app.iosched.shared.usecases.repository.LoadConferenceLocationUseCase
import com.google.samples.app.iosched.shared.usecases.repository.LoadConferenceMinZoomUseCase
import com.google.samples.app.iosched.shared.util.map
import javax.inject.Inject

class MapViewModel @Inject constructor(
    private val loadConferenceLocationUseCase: LoadConferenceLocationUseCase,
    private val loadConferenceMinZoomUseCase: LoadConferenceMinZoomUseCase
) : ViewModel() {

    /**
     * Markers for key locations on map (i.e. sessions, code labs, food, bathrooms, etc.)
     */
    val markers: LiveData<List<MarkerOptions?>>

    /**
     * Area covered by the venue. Determines the viewport of the map.
     */
    val conferenceLocationBounds: LiveData<LatLngBounds?>

    /**
     * Min zoom level for map.
     */
    val minZoom: LiveData<Float?>

    /**
     * True if any errors occur in fetching the data.
     */
    val errorMessageShown = MutableLiveData<Boolean>().apply { value = false }

    // TODO: add cameraTarget and zoomLevel to VM and wire it from domain layer to databinding.

    init {
        // TODO fetch markers.
        markers = MutableLiveData()

        // Fetch conference location.
        val conferenceLocationLiveResult = loadConferenceLocationUseCase.executeAsync(Unit)
        conferenceLocationBounds = conferenceLocationLiveResult.map {
            errorMessageShown.value = it is Result.Error
            (it as? Result.Success)?.data
        }

        // Fetch map min zoom.
        val minZoomLiveResult = loadConferenceMinZoomUseCase.executeAsync(Unit)
        minZoom = minZoomLiveResult.map {
            errorMessageShown.value = errorMessageShown.value!! || it is Result.Error
            (it as? Result.Success)?.data
        }

        // Check if there were errors.
        conferenceLocationLiveResult.map { conferenceLocationResult ->
            minZoomLiveResult.map { minZoomResult ->
                errorMessageShown.value =
                        conferenceLocationResult is Result.Error || minZoomResult is Result.Error
            }
        }
    }
}