package com.kodekita.toaster

import android.content.Context
import android.widget.Toast

object ToasterMessage {
    fun toaster(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}