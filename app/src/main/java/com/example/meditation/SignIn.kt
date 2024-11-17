package com.example.meditation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_in)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val button1: Button =findViewById(R.id.signin_btnloginnew)
            button1.setOnClickListener{
                val btn1= Intent(this@SignIn,Maindashboard::class.java)
                startActivity(btn1)

            }
            val button2: Button =findViewById(R.id.signin_btnnew_signup)
            button2.setOnClickListener{
                val btn2= Intent(this@SignIn,Sign_Up::class.java)
                startActivity(btn2)

            }
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}