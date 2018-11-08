package com.google.samples.app.iosched.ui.schedule

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.databinding.FragmentScheduleBinding

class ScheduleFragment : Fragment() {

    companion object {
        val TAG: String? = ScheduleFragment::class.java.simpleName
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        activity?.title = getString(R.string.title_schedule)

        val viewModel: ScheduleViewModel =
            ViewModelProviders.of(this, ScheduleViewModelFactory())
                .get(ScheduleViewModel::class.java)

        val binding: FragmentScheduleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_schedule, container, false
        )

        // Set the layout variables
        binding.viewModel = viewModel

        // TODO: This is an example subscription
        observeViewModel(viewModel, binding)
        return binding.root
    }

    private fun observeViewModel(viewModel: ScheduleViewModel, b: FragmentScheduleBinding) {

        // Update text if there are sessions available
        viewModel.sessions.observe(this, Observer { sessions ->
            b.textView.let {
                val sb = StringBuilder()
                sessions?.forEach { session ->
                    sb.append("${session.title} by ${session.speakers.joinToString(", ")}")
                }
                it.text = sb.toString()
            }
        })

        // Update text if the screen is in loading state
        viewModel.isLoading.observe(this, Observer { isLoading ->
            if (isLoading!!) b.textView.text = getString(R.string.loading)
        })
    }
}