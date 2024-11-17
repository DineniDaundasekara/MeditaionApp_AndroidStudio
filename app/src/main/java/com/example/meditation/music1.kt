package com.example.meditation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class music1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_music1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val button1: Button =findViewById(R.id.main_btn_new2)
            button1.setOnClickListener{
                val btn1= Intent(this@music1,music2::class.java)
                startActivity(btn1)

            }
            val button2: Button =findViewById(R.id.music1_btn5)
            button2.setOnClickListener{
                val btn2= Intent(this@music1,Maindashboard::class.java)
                startActivity(btn2)

            }
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}