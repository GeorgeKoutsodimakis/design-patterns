package com.example.designpatterns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DecoratorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decorator)

//        val happyMap = HappyMap<String, String>(this)
//        happyMap["1"] = "one"
//        happyMap["2"] = "two"
//        happyMap["3"] = "three"
//
//        val sadMap = SadMap<String, String>(this)
//        sadMap["1"] = "one"
//        sadMap.remove("1")

        val bipolarMap = SadMap(this, HappyMap<String, String>(this))
        bipolarMap["2"] = "two"
        bipolarMap["3"] = "three"
        bipolarMap["4"] = "four"
        bipolarMap.remove("3")


    }
}