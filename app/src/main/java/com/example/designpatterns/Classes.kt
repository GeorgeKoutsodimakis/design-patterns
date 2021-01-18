package com.example.designpatterns

open class Rifleman : Infantry {
    override fun move(x: Long, y: Long) {
        // Move at its own pace
    }


    override fun attack(x: Long, y: Long) {
        //shoot
    }
}


open class RocketSoldier : Infantry {
    override fun move(x: Long, y: Long) {
        //move
    }

    override fun attack(x: Long, y: Long) {
        //attack
    }

}

open class Grenadier : Infantry {
    override fun move(x: Long, y: Long) {
        //moves slowly grenades are heavy
    }

    override fun attack(x: Long, y: Long) {
        //throw grenades
    }
}

class UpgradedRifleMan : Rifleman() {
    override fun attack(x: Long, y: Long) {
        //Shoots twice as fast
    }
}

class UpgradedGrenadier : Grenadier() {
    override fun attack(x: Long, y: Long) {
        //throw multiple grenades
    }
}

class LightRifleman : Rifleman() {
    override fun move(x: Long, y: Long) {
        //running faster
    }
}

class LightGrenadier:Grenadier(){
    override fun move(x: Long, y: Long) {
        //faster movement
    }
}

class Soldier( val weapon:Weapon,  val legs:Legs, val name:String):Infantry{
    override fun move(x: Long, y: Long) {
        legs.move()

    }

    override fun attack(x: Long, y: Long) {
        weapon.causeDamage()
    }

}