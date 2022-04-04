package com.example.appkotlin2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Instrucciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instrucciones)
        val buttnatras: Button =findViewById(R.id.buttonatras3)
        buttnatras.setOnClickListener{atras()}
    }
    private fun atras(){
        startActivity(Intent(this,MainActivity::class.java))
    }
    }

