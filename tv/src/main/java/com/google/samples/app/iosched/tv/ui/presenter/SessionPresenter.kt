package com.google.samples.app.iosched.tv.ui.presenter

import android.support.v17.leanback.widget.ImageCardView
import android.support.v17.leanback.widget.Presenter
import android.view.ViewGroup
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.util.TimeUtils
import com.google.samples.app.iosched.tv.R

/**
 * Leanback presenter for displaying session information in a card view. Displays an individual
 * session from a list of sessions.
 */
class SessionPresenter: Presenter() {

    override fun onCreateViewHolder(parent: ViewGroup?): ViewHolder {
        // TODO: Create a better view based on the mocks
        val cardView = ImageCardView(parent?.context)
        return ViewHolder(cardView)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder?, item: Any?) {
        val session = item as Session
        val cardView = viewHolder?.view as ImageCardView
        cardView.titleText = session.title
        cardView.contentText = TimeUtils.timeString(session.startTime, session.endTime)
        // Set the image card's height and width.
        val resources = cardView.context.resources
        val cardWidth = resources.getDimensionPixelSize(R.dimen.card_width)
        val cardHeight = resources.getDimensionPixelSize(R.dimen.card_height)
        cardView.setMainImageDimensions(cardWidth, cardHeight)
    }
    override fun onUnbindViewHolder(viewHolder: ViewHolder?) {}
}