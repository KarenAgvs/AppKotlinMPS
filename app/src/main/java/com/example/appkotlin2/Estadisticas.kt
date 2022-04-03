package com.example.appkotlin2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.appkotlin2.Operaciones.Companion.listaAprueban
import com.example.appkotlin2.Operaciones.Companion.listaEstudiantes
import com.example.appkotlin2.Operaciones.Companion.listaRecuperan
import com.example.appkotlin2.Operaciones.Companion.listaReprueban

class Estadisticas : AppCompatActivity() {
    var operaciones: Operaciones?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estadisticas)

        val buttonatras:Button=findViewById(R.id.buttonatras)
        buttonatras.setOnClickListener{buttonatrasmain()}

        operaciones= Operaciones()
        val totalEstudiantes:Int= listaEstudiantes.count()
        val aprobados:Int =listaAprueban.count()
        val recuperan:Int= listaRecuperan.count()
        val reprueban: Int= listaReprueban.count()

        val total:TextView=findViewById(R.id.textviewtotalest)
        val Eaprobados:TextView=findViewById(R.id.textViewaprobados)
        val Erecuperan:TextView=findViewById(R.id.textViewrecuperacion)
        val Ereprueban:TextView=findViewById(R.id.textViewreprobados)

        total.text=totalEstudiantes.toString()
        Eaprobados.text=aprobados.toString()
        Erecuperan.text=recuperan.toString()
        Ereprueban.text=reprueban.toString()
    }

    private fun buttonatrasmain() {
        startActivity(Intent(this,MainActivity::class.java))
    }
}