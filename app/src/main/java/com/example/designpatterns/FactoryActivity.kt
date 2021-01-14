package com.example.designpatterns

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.designpatterns.Factories.AnimalFactory

class FactoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factory)
        setSupportActionBar(findViewById(R.id.toolbar))

        val animalTypes = listOf(
            "dog" to "beagle",
            "cat" to "persian",
            "dog" to "poodle")

        for ((type,breed) in animalTypes) {
            val c = AnimalFactory().createAnimal(type,breed)
            Toast.makeText(this, "${c.name}", Toast.LENGTH_SHORT).show()
        }


    }
}