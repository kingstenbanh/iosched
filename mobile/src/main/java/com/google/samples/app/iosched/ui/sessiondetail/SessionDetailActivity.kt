package com.google.samples.app.iosched.ui.sessiondetail

import android.os.Bundle
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.shared.util.inTransaction
import dagger.android.support.DaggerAppCompatActivity

class SessionDetailActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_session_detail)

        if (savedInstanceState == null) {
            supportFragmentManager.inTransaction {
                add(R.id.session_detail_container, SessionDetailFragment())
            }
        }
    }
}