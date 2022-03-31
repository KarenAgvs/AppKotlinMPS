package com.example.appkotlin2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Resultados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultados)
        val buttonatras2:Button=findViewById(R.id.buttonatras2)
        buttonatras2.setOnClickListener{volveralregistro()}

         var txtresults=findViewById<TextView>(R.id.txviewresults)
        var miBundle:Bundle?=this.intent.extras

        if(miBundle!=null){
            txtresults.text="Estudiante: ${miBundle.getString("Nombre")}"
            "Identificación:${miBundle.getString("Documento")}"
            "Materia 1:${miBundle.getString("Materia1")}"
            "Materia 2:${miBundle.getString("Materia2")}"
            "Materia 3:${miBundle.getString("Materia3")}"
            "nota: ${miBundle.getDouble("Nota1")}"
            "nota: ${miBundle.getDouble("Nota2")}"
            "nota: ${miBundle.getDouble("Nota3")}"
            "Materia 4:${miBundle.getString("Materia4")}"
            "Materia 5:${miBundle.getString("Materia5")}"
            "nota:${miBundle.getString("Nota4")}"
            "nota:${miBundle.getString("Nota5")}"
            "Promedio:${miBundle.getDouble("Promedio")}"

        }

    }

    private fun volveralregistro() {
        startActivity(Intent(this,Registro::class.java))
    }


    /*if(est.nota1 < 0 ||  est.nota2 < 0 || est.nota3 < 0 || est.nota4 <0 || est.nota5 <0){
        Toast.makeText(applicationContext()"Ingresa una nota válida", Toast.LENGTH_LONG).show()
    }

    else if(est.nota1 > 5 ||  est.nota2 > 5 || est.nota3 > 5 || est.nota4 > 5 || est.nota5 > 5){
        Toast.makeText(applicationContext()"Ingresa una nota válida", Toast.LENGTH_LONG).show()
    }*/

}