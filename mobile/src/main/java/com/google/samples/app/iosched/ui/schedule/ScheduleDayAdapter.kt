package com.google.samples.app.iosched.ui.schedule

import android.R.layout
import android.support.v7.widget.RecyclerView.Adapter
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.google.samples.app.iosched.shared.model.Session
import com.google.samples.app.iosched.shared.util.inflate

class ScheduleDayAdapter : Adapter<SessionViewHolder>() {

    private var sessions: List<Session> = emptyList()

    fun setList(sessions: List<Session>) {
        // TODO diff
        this.sessions = sessions
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = sessions.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SessionViewHolder {
        return SessionViewHolder(parent.inflate(layout.simple_list_item_1))
    }

    override fun onBindViewHolder(holder: SessionViewHolder, position: Int) {
        holder.bind(sessions[position])
    }

}

class SessionViewHolder(itemView: View) : ViewHolder(itemView) {
    val title: TextView = itemView.findViewById(android.R.id.text1)

    fun bind(session: Session) {
        title.text = session.title
    }
}