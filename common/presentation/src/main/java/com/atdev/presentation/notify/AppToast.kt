package com.atdev.presentation.ui.notify

import android.content.Context
import android.widget.Toast

class AppToast {

    fun showLong(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    fun showShort(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    fun show(context: Context, msg: String,duration: Int) {
        Toast.makeText(context, msg, duration).show()
    }
}