package com.google.samples.app.iosched.ui

import android.os.Bundle
import android.support.v4.app.Fragment
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.ui.feed.FeedFragment
import com.google.samples.app.iosched.ui.map.MapFragment
import com.google.samples.app.iosched.ui.schedule.ScheduleFragment
import com.google.samples.app.iosched.shared.util.consume
import com.google.samples.app.iosched.shared.util.inTransaction
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add product list fragment if this is first creation
        if (savedInstanceState == null) {
            // Show Schdule on first creation
            val fragment = ScheduleFragment()

            supportFragmentManager.inTransaction {
                add(R.id.fragment_container, fragment)
            }
        }

        navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_schedule -> consume {
                    replaceFragment(
                        ScheduleFragment()
                    )
                }
                R.id.navigation_feed -> consume {
                    replaceFragment(
                        FeedFragment()
                    )
                }
                R.id.navigation_map -> consume { replaceFragment(MapFragment()) }
                else -> false
            }
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.inTransaction {
            replace(R.id.fragment_container, fragment)
        }
    }
}
