package com.google.samples.app.iosched.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.BottomNavigationView.OnNavigationItemSelectedListener
import android.support.v4.app.Fragment
import com.google.samples.app.iosched.R
import com.google.samples.app.iosched.ui.feed.FeedFragment
import com.google.samples.app.iosched.ui.map.MapFragment
import com.google.samples.app.iosched.ui.schedule.ScheduleFragment

class MainActivity : AppCompatActivity() {

    private val onNavigationItemSelectedListener = OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_schedule -> {
                replaceFragment(ScheduleFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_feed -> {
                replaceFragment(FeedFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_map -> {
                replaceFragment(MapFragment())
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment)
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add product list fragment if this is first creation
        if (savedInstanceState == null) {
            val fragment = ScheduleFragment()

            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragment, ScheduleFragment.TAG)
                .commit()
        }

        val navigation: BottomNavigationView = findViewById(R.id.navigation)
        navigation.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

    }
}
