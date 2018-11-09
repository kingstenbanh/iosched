package com.google.samples.app.iosched.ui.sessiondetail

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.databinding.FragmentSessionDetailBinding

class SessionDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // TODO: wire up detail page to schedule list and get session ID intent extra (b/72671324)
        val dummySessionId = "1"

        val sessionDetailViewModel = ViewModelProviders
            .of(this, SessionDetailViewModelFactory(dummySessionId))
            .get(SessionDetailViewModel::class.java)

        val binding: FragmentSessionDetailBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_session_detail, container, false
        )
        binding.run {
            viewModel = sessionDetailViewModel
            setLifecycleOwner(this@SessionDetailFragment)
        }

        return binding.root
    }
}