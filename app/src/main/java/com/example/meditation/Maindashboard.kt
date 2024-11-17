package com.example.meditation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Maindashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_maindashboard)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val button1: Button =findViewById(R.id.main_button1)
            button1.setOnClickListener{
                val btn1= Intent(this@Maindashboard,profile::class.java)
                startActivity(btn1)

            }
            val button2: Button =findViewById(R.id.main_button4)
            button2.setOnClickListener{
                val btn2= Intent(this@Maindashboard,music1::class.java)
                startActivity(btn2)

            }

            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}