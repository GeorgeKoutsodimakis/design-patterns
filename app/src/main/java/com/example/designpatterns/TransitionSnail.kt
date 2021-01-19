package com.example.designpatterns

class TransitionSnail {
    val directionFacing = Direction.LEFT

    val sprites = listOf(
        java.io.File("snail-left.jpg"),
        java.io.File("snail-right.jpg")
    )


    fun getCurrentSprite(sprites: List<java.io.File>): java.io.File {
        return when (directionFacing) {
            Direction.LEFT -> sprites[0]
            Direction.RIGHT -> sprites[1]
        }
    }
}