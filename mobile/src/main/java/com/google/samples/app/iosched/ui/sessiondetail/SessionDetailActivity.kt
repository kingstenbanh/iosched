package com.google.samples.app.iosched.ui.sessiondetail

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.shared.util.inTransaction

class SessionDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_session_detail)

        if (savedInstanceState == null) {
            supportFragmentManager.inTransaction {
                add(R.id.fragment_container, SessionDetailFragment())
            }
        }
    }
}