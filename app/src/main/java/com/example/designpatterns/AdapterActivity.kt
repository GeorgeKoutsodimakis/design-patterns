package com.example.designpatterns

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.stream.Stream

class AdapterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adapter)


        val listSample = listOf("1", "2", "3")
        streamProcessing(listSample.stream())
    }


    private fun <T> streamProcessing(stream: Stream<T>) {
        for (st in stream) {
            Toast.makeText(this, "$st", Toast.LENGTH_SHORT).show()
        }
    }
}