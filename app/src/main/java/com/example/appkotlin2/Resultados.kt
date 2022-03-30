package com.example.appkotlin2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Resultados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)

        /*val txtnombre=findViewById<TextView>(R.id.txviewnombre)
        var miBundle:Bundle?=this.intent.extras

        if(miBundle!=null){
            txtnombre.text="Estudiante ${miBundle.getString("Nombre")}"
        }*/
    }
}