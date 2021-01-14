package com.example.designpatterns

interface Unit

interface Vehicle : Unit

interface Infantry : Unit


interface HQ {
    fun buildBarracks(): Building<InfantryUnits, Infantry>
    fun buildVehicleFactory(): Building<VehicleUnits, Vehicle>
}

interface Building<in UnitType, out ProducedUnit>
        where UnitType : Types, ProducedUnit : Unit {
    fun build(type: UnitType) : ProducedUnit
}

interface Types
