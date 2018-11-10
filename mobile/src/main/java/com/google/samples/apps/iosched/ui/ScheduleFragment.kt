package com.google.samples.apps.iosched.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.samples.apps.iosched.R

class ScheduleFragment : Fragment() {

    companion object {
        val TAG: String = ScheduleFragment::class.java.simpleName
        fun newInstance() = ScheduleFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity?.title = getString(R.string.title_schedule)
        val view = inflater.inflate(R.layout.fragment_schedule, container, false)
        return view
    }
}