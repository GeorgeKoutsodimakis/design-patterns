package com.example.designpatterns


typealias PointsOfDamage = Long
typealias Meters = Int


interface Unit

interface Vehicle : Unit

interface Infantry : Unit{
    fun move(x:Long,y:Long)
    fun attack(x:Long,y: Long)
}

interface Weapon{
    fun causeDamage():PointsOfDamage
}

interface Legs{
    fun move():Meters
}
