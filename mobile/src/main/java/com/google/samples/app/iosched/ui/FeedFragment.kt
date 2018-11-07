package com.google.samples.app.iosched.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.samples.app.iosched.R

class FeedFragment : Fragment() {

    companion object {
        val TAG: String? = FeedFragment::class.java.simpleName
        fun newInstance() = FeedFragment
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity?.title = getString(R.string.title_feed)
        val view = inflater.inflate(R.layout.fragment_feed, container, false)
        return view
    }
}