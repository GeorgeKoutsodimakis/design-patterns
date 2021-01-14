package com.example.designpatterns.Factories

import com.example.designpatterns.Animals.Dogs.Beagle
import com.example.designpatterns.Animals.Dogs.Dog
import com.example.designpatterns.Animals.Dogs.Poodle

class DogFactory {
    fun createDog(breed: String, id: Int): Dog {
        return when (breed.trim().toLowerCase()) {
            "beagle" -> Beagle(id, breed)
            "poodle" -> Poodle(id, breed)
            else -> throw RuntimeException("Unknown dog breed $breed")
        }
    }
}