package com.example.designpatterns

class Grenade : Weapon {
    override fun causeDamage() = GRENADE_DAMAGE
}

class GrenadePack : Weapon {
    override fun causeDamage() = GRENADE_DAMAGE * 3
}

class Rifle : Weapon {
    override fun causeDamage() = RIFLE_DAMAGE
}

class MachineGun : Weapon {
    override fun causeDamage() = RIFLE_DAMAGE * 2
}