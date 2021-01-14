package com.example.designpatterns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class AbstractFactoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abstract_factory)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val hq = CatHQ()
        val barracks = hq.buildBarracks()
        val barracks2 = hq.buildBarracks()
        val vehicleFactory = hq.buildVehicleFactory()

        val units = listOf(
            barracks.build(InfantryUnits.RIFLEMEN),
            barracks2.build(InfantryUnits.ROCKET_SOLDIER),
            barracks2.build(InfantryUnits.ROCKET_SOLDIER),
            vehicleFactory.build(VehicleUnits.TANK),
            vehicleFactory.build(VehicleUnits.APC),
            vehicleFactory.build(VehicleUnits.APC)
        )


        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UnitAdapter(units,this)

//        for (u in units) {
//            Toast.makeText(this, "$u", Toast.LENGTH_SHORT).show()
//        }
    }
}