package com.android.gallery

import android.content.Context
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

class VolleySingleton private constructor(context: Context) {
    companion object {
        private var INSTANCE: VolleySingleton? = null
        fun getInstance(context: Context) =
            INSTANCE ?: synchronized(this) {
                VolleySingleton(context).also {
                    INSTANCE = it
                }
            }
    }

    var requestQueue: RequestQueue = Volley.newRequestQueue(context.applicationContext)
}