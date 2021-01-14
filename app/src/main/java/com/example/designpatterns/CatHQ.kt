package com.example.designpatterns

class CatHQ : HQ {

    private val buildings = mutableListOf<Building<*, Unit>>()

    override fun buildBarracks(): Building<InfantryUnits, Infantry> {
        val building = object : Building<InfantryUnits, Infantry> {
            override fun build(type: InfantryUnits): Infantry {
                return when (type) {
                    InfantryUnits.RIFLEMEN -> Rifleman()
                    InfantryUnits.ROCKET_SOLDIER -> RocketSoldier()
                }
            }
        }
        buildings.add(building)
        return building
    }

    override fun buildVehicleFactory(): Building<VehicleUnits, Vehicle> {
        val vehicles = object : Building<VehicleUnits, Vehicle> {
            override fun build(type: VehicleUnits): Vehicle {
                return when (type) {
                    VehicleUnits.APC -> APC()
                    VehicleUnits.TANK -> Tank()
                }
            }
        }
        buildings.add(vehicles)
        return vehicles
    }
}