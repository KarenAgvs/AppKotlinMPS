package com.example.appkotlin2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterEstudiante (val estudiantesList:ArrayList<Estudiante>): RecyclerView.Adapter<AdapterEstudiante.ViewHolderEstudiante>(){

    class ViewHolderEstudiante(view: View):RecyclerView.ViewHolder(view) {
        var nombre: TextView = view.findViewById(R.id.idNombre)
        var promedio: TextView = view.findViewById(R.id.idPromedio)
        var resultado: TextView = view.findViewById(R.id.idResultado)


        fun asignarDatos(datoEst: Estudiante) {
            nombre.text = datoEst.nombre
            promedio.text = datoEst.promedio.toString()

            if (datoEst.promedio < 3.5) {
                resultado.text = "Aprueba"
            } else {
                resultado.text = "Reprueba"
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterEstudiante.ViewHolderEstudiante {
        var layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolderEstudiante(layoutInflater.inflate(R.layout.item_list, parent, false))
    }

    override fun onBindViewHolder(holder: AdapterEstudiante.ViewHolderEstudiante, position: Int) {
        holder.asignarDatos(estudiantesList.get(position))
    }

    override fun getItemCount(): Int {
        return estudiantesList.size
    }

}