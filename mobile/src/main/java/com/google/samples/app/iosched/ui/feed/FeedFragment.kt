package com.google.samples.app.iosched.ui.feed

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.samples.app.iosched.R
import kotlinx.android.synthetic.main.toolbar.*

class FeedFragment : Fragment() {

    companion object {
        val TAG: String? = FeedFragment::class.java.simpleName
        fun newInstance() = FeedFragment
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.title = getString(R.string.title_feed)
        return inflater.inflate(R.layout.fragment_feed, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        toolbar.setTitle(R.string.title_feed)
    }
}