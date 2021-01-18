package com.example.designpatterns

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class CompositeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_composite)

        val miller = Rifleman()
        val caparzo = Rifleman()
        val jackson = Sniper()


        val squad = Squad(miller, caparzo, jackson)

        Toast.makeText(this, "Bullets left  :  ${squad.bulletsLeft()}", Toast.LENGTH_LONG).show()


    }

}
