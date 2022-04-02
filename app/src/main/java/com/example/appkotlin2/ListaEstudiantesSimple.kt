package com.example.appkotlin2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListaEstudiantesSimple : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_estudiantes_simple)

        var recycler=findViewById<RecyclerView>(R.id.recyclerEstudiantes)
        recycler.adapter=AdapterEstudiante(Operaciones.listaEstudiantes)
        recycler.layoutManager= LinearLayoutManager(this)
    }
}