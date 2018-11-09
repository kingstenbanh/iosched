package com.google.samples.app.iosched.tv.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ProgressBar
import com.google.samples.app.iosched.tv.R

/**
 * Displays a loading spinner. To use, add this fragment to your frame but don't forget to remove
 * when you are done.
 *
 * To add, add this fragment with the fragment manager.
 * ```
 * fragmentManager?.inTransaction {
 *  add(R.id.main_frame, spinnerFragment)
 * }
 * ```
 * Don't forget to remove this fragment in your [Fragment.onStop].
 * ```
 * override fun onStop() {
 *  super.onStop()
 *  fragmentManager?.inTransaction {
 *    remove(spinnerFragment)
 *  }
 * }
 *
 * ```
 */
class SpinnerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val context = inflater.context
        val progressBar = ProgressBar(context)

        if (container is FrameLayout) {
            val res = context.resources
            val spinnerSize = res.getDimensionPixelSize(R.dimen.spinner_size)
            val layoutParams = FrameLayout.LayoutParams(spinnerSize, spinnerSize, Gravity.CENTER)
            progressBar.layoutParams = layoutParams
        }
        return progressBar
    }
}