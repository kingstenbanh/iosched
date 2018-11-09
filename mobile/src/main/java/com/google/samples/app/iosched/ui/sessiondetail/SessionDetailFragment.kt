package com.google.samples.app.iosched.ui.sessiondetail

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.ShareCompat
import android.support.v7.app.AppCompatActivity
import android.view.*
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.databinding.FragmentSessionDetailBinding
import com.google.samples.app.iosched.shared.util.viewModelProvider
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class SessionDetailFragment : DaggerFragment() {

    private var shareString = ""

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        setHasOptionsMenu(true)

        // TODO: wire up detail page to schedule list and get session ID intent extra (b/72671324)
        val dummySessionId = "1"

        val sessionDetailViewModel: SessionDetailViewModel = viewModelProvider(viewModelFactory)
        sessionDetailViewModel.loadSessionById(dummySessionId)

        val binding: FragmentSessionDetailBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_session_detail, container, false
        )
        binding.run {
            viewModel = sessionDetailViewModel
            setLifecycleOwner(this@SessionDetailFragment)
        }

        // TODO: replace with Toolbar (b/73537084)
        (activity as AppCompatActivity).setSupportActionBar(binding.sessionDetailToolbar)

        sessionDetailViewModel.session.observe(this, Observer {
            shareString = if (it == null) {
                ""
            } else {
                getString(R.string.share_text_session_detail, it.title, it.sessionUrl)
            }
        })

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.session_detail_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menu_item_share -> {
                ShareCompat.IntentBuilder.from(activity)
                    .setType("text/plain")
                    .setText(shareString)
                    .setChooserTitle(R.string.intent_chooser_session_detail)
                    .startChooser()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}