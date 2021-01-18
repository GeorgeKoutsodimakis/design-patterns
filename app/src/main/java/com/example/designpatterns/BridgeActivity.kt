package com.example.designpatterns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class BridgeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bridge)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val unit: List<Soldier> = listOf(
            Soldier(Rifle(), RegularLegs(), "Chris"),
            Soldier(Grenade(), RegularLegs(), "Thanos"),
            Soldier(GrenadePack(), RegularLegs(), "Manos"),
            Soldier(MachineGun(), RegularLegs(), "Ntelos"),
            Soldier(Rifle(), AthleticLegs(), "Billys"),
            Soldier(Grenade(), AthleticLegs(), "Kostas")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = UnitAdapter(unit, this)


    }
}