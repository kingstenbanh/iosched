package com.google.samples.app.iosched.ui.map

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.samples.app.iosched.R
import kotlinx.android.synthetic.main.toolbar.*

class MapFragment : Fragment() {

    companion object {
        val TAG: String? = MapFragment::class.java.simpleName
        fun newInstance() = MapFragment
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity?.title = getString(R.string.title_map)
        return inflater.inflate(R.layout.fragment_map, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        toolbar.setTitle(R.string.title_map)
    }
}