package com.google.samples.app.iosched.ui.schedule

import android.support.v7.widget.RecyclerView.Adapter
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import com.google.samples.app.iosched.databinding.ItemSessionBinding
import com.google.samples.app.iosched.shared.model.Session

class ScheduleDayAdapter : Adapter<SessionViewHolder>() {

    private var sessions: List<Session> = emptyList()

    fun setList(sessions: List<Session>) {
        // TODO diff
        this.sessions = sessions
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = sessions.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SessionViewHolder {
        return SessionViewHolder(ItemSessionBinding.inflate(
            LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: SessionViewHolder, position: Int) {
        holder.bind(sessions[position])
    }

}

class SessionViewHolder(private val binding: ItemSessionBinding) : ViewHolder(binding.root) {

    fun bind(session: Session) {
        binding.session = session
        binding.executePendingBindings()
    }
}