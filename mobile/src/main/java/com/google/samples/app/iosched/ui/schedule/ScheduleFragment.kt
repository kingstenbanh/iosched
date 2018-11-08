package com.google.samples.app.iosched.ui.schedule

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.databinding.FragmentScheduleBinding
import dagger.android.support.DaggerFragment
import kotlinx.android.synthetic.main.toolbar.*
import javax.inject.Inject

class ScheduleFragment : DaggerFragment() {

    companion object {
        val TAG: String? = ScheduleFragment::class.java.simpleName
    }

    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    private lateinit var viewModel: ScheduleViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        viewModel = ViewModelProviders.of(this, viewModelFactory).get(ScheduleViewModel::class.java)

        val binding: FragmentScheduleBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_schedule, container, false
        )

        // Set the layout variables
        binding.viewModel = viewModel
        binding.setLifecycleOwner(this)

        // TODO: This is an example subscription
        observeViewModel(viewModel, binding)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        toolbar.setTitle(R.string.title_schedule)
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