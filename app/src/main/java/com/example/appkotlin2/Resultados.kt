package com.example.appkotlin2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Resultados : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)
        var est: Estudiante= Estudiante()
        var operaciones:Operaciones?=null
        val buttonatras2:Button=findViewById(R.id.buttonatras2)
        buttonatras2.setOnClickListener{volveralregistro()}


        val txtresults=findViewById<TextView>(R.id.txviewresults)
        val mensaje=findViewById<TextView>(R.id.textmensaje)

        val miBundle:Bundle?=this.intent.extras


        if(miBundle!=null){
            txtresults.text="Estudiante :${miBundle.getString("Nombre")}\n"+
            "Identificación :${miBundle.getString("Documento")}\n"+
            "Edad: ${miBundle.getInt("Edad")}\n"+
            "Materia 1: ${miBundle.getString("Materia1")}\n"+
            "Nota: ${miBundle.getDouble("Nota1")}\n"+
            "Materia 2: ${miBundle.getString("Materia2")}\n"+
            "Nota: ${miBundle.getDouble("Nota2")}\n"+
            "Materia 3:${miBundle.getString("Materia3")}\n"+
            "Nota: ${miBundle.getDouble("Nota3")}\n"+
            "Materia 4: ${miBundle.getString("Materia4")}\n"+
            "Nota: ${miBundle.getDouble("Nota4")}\n"+
            "Materia 5:${miBundle.getString("Materia5")}\n"+
            "Nota: ${miBundle.getDouble("Nota5")}\n"+
            "Promedio: ${miBundle.getDouble("Promedio")}\n"

            mensaje.text="Estudiante aprobado"
            operaciones?.registrarEstudianteAprobado(est)

        }

    }

    private fun volveralregistro() {
        startActivity(Intent(this,Registro::class.java))
    }

}