package com.example.designpatterns.Factories

import com.example.designpatterns.Animals.Animal

class AnimalFactory {
    var counter = 0

    private val dogFactory = DogFactory()
    private val catFactory = CatFactory()

    fun createAnimal(type: String, breed: String): Animal {
        return when (type.trim().toLowerCase()) {
            "cat" -> catFactory.createCat(breed, ++counter)
            "dog" -> dogFactory.createDog(breed, ++counter)
            else -> throw RuntimeException("Unknown animal $type")
        }
    }
}