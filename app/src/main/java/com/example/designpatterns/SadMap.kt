package com.example.designpatterns

import android.content.Context
import android.widget.Toast

class SadMap<K, V>(var context: Context, private val map: MutableMap<K, V> = mutableMapOf()) :
    MutableMap<K, V> by map {

    override fun remove(key: K): V? {
        return map.remove(key).apply {
            this.let {
                Toast.makeText(context, "Okay.... $key - removed", Toast.LENGTH_LONG).show()

            }
        }
    }
}