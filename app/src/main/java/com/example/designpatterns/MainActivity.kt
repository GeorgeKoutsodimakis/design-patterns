package com.example.designpatterns

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.designpatterns.Patterns.Singleton

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        testSingleton()
    }


    private fun testSingleton() {
        for (i in 1..5) {
            Toast.makeText(this, "counter" + "${Singleton.increment()}", Toast.LENGTH_LONG).show()
        }
    }
}