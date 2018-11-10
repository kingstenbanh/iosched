package com.google.samples.app.iosched.ui.map

import android.arch.lifecycle.ViewModelProvider
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.MapView
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.databinding.FragmentMapBinding
import com.google.samples.app.iosched.shared.util.viewModelProvider
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.toolbar.*
import javax.inject.Inject

class MapFragment : DaggerFragment() {

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory
    private var mapViewBundle: Bundle? = null
    private lateinit var mapView: MapView

    companion object {
        val TAG: String? = MapFragment::class.java.simpleName
        fun newInstance() = MapFragment

        const val MAPVIEW_BUNDLE_KEY = "MapViewBundleKey"
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        toolbar.setTitle(R.string.title_map)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState != null) {
            mapViewBundle = savedInstanceState.getBundle(MAPVIEW_BUNDLE_KEY)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentMapBinding = DataBindingUtil.inflate<FragmentMapBinding>(
            inflater, R.layout.fragment_map, container, false
        ).apply {
            viewModel = viewModelProvider(viewModelFactory)
            setLifecycleOwner(this@MapFragment)
        }

        activity?.title = getString(R.string.title_map)

        mapView = binding.map.apply {
            onCreate(mapViewBundle)
        }

        initializeMap()

        return binding.root
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val mapViewBundle = outState.getBundle(MAPVIEW_BUNDLE_KEY)
            ?: Bundle().apply { putBundle(MAPVIEW_BUNDLE_KEY, this) }
        mapView.onSaveInstanceState(mapViewBundle)
    }

    override fun onResume() {
        super.onResume()
        mapView.onResume()
    }

    override fun onStart() {
        super.onStart()
        mapView.onStart()
    }

    override fun onStop() {
        super.onStop()
        mapView.onStop()
    }

    override fun onPause() {
        super.onPause()
        mapView.onPause()
    }

    override fun onDestroy() {
        super.onDestroy()
        mapView.onDestroy()
    }

    override fun onLowMemory() {
        super.onLowMemory()
        mapView.onLowMemory()
    }

    fun initializeMap() {
        // TODO: Move this completely to BindingAdapter

        mapView.getMapAsync {
            // TODO: Initialize marker icon bitmaps (active and normal)
            it?.apply {
                // TODO set maps style
                setOnMarkerClickListener {
                    // TODO fwd to VM
                    false
                }

                setOnMapClickListener {
                    // TDOO fwd to VM
                }

                // TODO: if user has enabled location permission, enable that on map.
            }
        }
    }
}