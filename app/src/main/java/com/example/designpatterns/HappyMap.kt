package com.example.designpatterns

import android.content.Context
import android.widget.Toast

class HappyMap<K, V>(var context: Context, private val map: MutableMap<K, V> = mutableMapOf()) :
    MutableMap<K, V> by map {

    override fun put(key: K, value: V): V? {
        return map.put(key, value).apply {
            this.let {
                Toast.makeText(context, "!Yay $key - $value", Toast.LENGTH_SHORT).show()
            }
        }
    }
}