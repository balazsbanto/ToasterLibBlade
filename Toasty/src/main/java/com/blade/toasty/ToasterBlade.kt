package com.blade.toasty

import android.content.Context
import android.widget.Toast

class ToasterBlade {
    companion object {
        fun show(context: Context, message:String) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }

    }
}