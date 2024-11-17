package com.example.meditation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class music2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_music2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val button1: Button =findViewById(R.id.music2_btn1)
            button1.setOnClickListener{
                val btn1= Intent(this@music2,music1::class.java)
                startActivity(btn1)

            }
            val button2: Button =findViewById(R.id.music2_btn3)
            button2.setOnClickListener{
                val btn2= Intent(this@music2,Maindashboard::class.java)
                startActivity(btn2)

            }
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}