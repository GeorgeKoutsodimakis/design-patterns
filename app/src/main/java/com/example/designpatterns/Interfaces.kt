package com.example.designpatterns


interface InfantryUnit : CanCountBullets {}

interface CanCountBullets {
    fun bulletsLeft(): Int
}
