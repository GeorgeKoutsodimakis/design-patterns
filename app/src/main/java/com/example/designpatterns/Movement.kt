package com.example.designpatterns

class RegularLegs : Legs {
    override fun move() = REGULAR_SPEED
}

class AthleticLegs : Legs {
    override fun move() = REGULAR_SPEED * 2
}