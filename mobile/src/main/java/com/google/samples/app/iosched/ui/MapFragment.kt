package com.google.samples.app.iosched.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.samples.app.iosched.R

class MapFragment : Fragment() {

    companion object {
        val TAG: String? = MapFragment::class.java.simpleName
        fun newInstance() = MapFragment
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity?.title = getString(R.string.title_map)
        val view = inflater.inflate(R.layout.fragment_map, container, false)
        return view
    }
}