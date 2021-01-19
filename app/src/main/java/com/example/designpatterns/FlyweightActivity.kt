package com.example.designpatterns

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class FlyweightActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flyweight)

        val sprites = List(8) { i ->
            java.io.File(
                when (i) {
                    0 -> "snail-left.jpg"
                    1 -> "snail-right.jpg"
                    in 2..4 -> "snail-move-left-${i - 1}.jpg"
                    else -> "snail-move-right${(4 - i)}.jpg"
                }
            )
        }


        val transitionSnail = TransitionSnail()
        transitionSnail.getCurrentSprite(sprites)


    }
}