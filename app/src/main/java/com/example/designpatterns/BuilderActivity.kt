package com.example.designpatterns

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BuilderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_builder)

        val mail = MailBuilder("hello@fromTheOtherSide.com")
            .title("Hallo von der anderen Seite ")
            .message("Hola desde el otro lado")
            .build()

        Toast.makeText(this, "${mail.title}" + "\n ${mail.msg}", Toast.LENGTH_LONG).show()
    }
}