package com.example.designpatterns

open class Rifleman(initialMagazine: Int = 3) : InfantryUnit {
    private val magazines = List<Magazine>(initialMagazine) { Magazine(5) }
    override fun bulletsLeft(): Int = magazines.sumBy { it.bulletsLeft() }
}


open class Sniper(intialBullets: Int = 50) : InfantryUnit {
    private val bullets = List(intialBullets) { Bullet() }
    override fun bulletsLeft(): Int = bullets.size


}

class Squad(private val units: MutableList<InfantryUnit> = mutableListOf()) : CanCountBullets {
    constructor(vararg units: InfantryUnit) : this(mutableListOf()) {
        for (unit in units) {
            this.units.add(unit)
        }
    }

    override fun bulletsLeft(): Int = units.sumBy { it.bulletsLeft() }
}


class Bullet

class Magazine(capacity: Int) : CanCountBullets {
    private val bullets = List(capacity) { Bullet() }
    override fun bulletsLeft(): Int = bullets.size
}