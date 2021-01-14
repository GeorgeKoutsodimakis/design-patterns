package com.example.designpatterns.Factories

import com.example.designpatterns.Animals.Cats.Cat
import com.example.designpatterns.Animals.Cats.Persian

class CatFactory {
    fun createCat(breed:String,id:Int): Cat {
        return when(breed.trim().toLowerCase()){
            "persian" -> Persian(id,breed)
            else -> throw RuntimeException("Unknown dog breed $breed")
        }
    }
}