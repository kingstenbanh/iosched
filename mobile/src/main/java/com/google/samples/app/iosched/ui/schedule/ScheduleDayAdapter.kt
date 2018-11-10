package com.google.samples.app.iosched.ui.schedule

import android.support.v7.recyclerview.extensions.ListAdapter
import android.support.v7.util.DiffUtil
import android.support.v7.widget.RecyclerView.Adapter
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import com.google.samples.app.iosched.databinding.ItemSessionBinding
import com.google.samples.app.iosched.shared.model.Session

class ScheduleDayAdapter(
    private val eventListener: ScheduleEventListener
) : ListAdapter<Session, SessionViewHolder>(SessionDiff) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SessionViewHolder {
        return SessionViewHolder(
            ItemSessionBinding.inflate(LayoutInflater.from(parent.context), parent, false),
            eventListener)
    }

    override fun onBindViewHolder(holder: SessionViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}

class SessionViewHolder(
    private val binding: ItemSessionBinding,
    private val eventListener: ScheduleEventListener
) : ViewHolder(binding.root) {

    fun bind(session: Session) {
        binding.session = session
        binding.eventListener = eventListener
        binding.executePendingBindings()
    }
}

object SessionDiff : DiffUtil.ItemCallback<Session>() {

    override fun areItemsTheSame(oldItem: Session, newItem: Session): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Session, newItem: Session) = (oldItem == newItem)
}