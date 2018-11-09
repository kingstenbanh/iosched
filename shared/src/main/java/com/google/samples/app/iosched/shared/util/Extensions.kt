package com.google.samples.app.iosched.shared.util

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction

inline fun consume(f: () -> Unit): Boolean {
    f()
    return true
}

inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction().func().commit()
}