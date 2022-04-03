package com.example.appkotlin2
import java.io.Serializable

class Operaciones: Serializable {
    companion object{

        var listaEstudiantes = arrayListOf<Estudiante>()
        var listaAprueban =  arrayListOf<Estudiante>()
        var listaRecuperan=  arrayListOf<Estudiante>()
        var listaReprueban= arrayListOf<Estudiante>()
    }


    fun registrarEstudiante(estudiante: Estudiante){

        if(estudiante.promedio>3.5)
        listaEstudiantes.add(estudiante)
        listaAprueban.add(estudiante)
    }

    fun registrarEstudianteAprobado(estudiante: Estudiante){
        listaAprueban.add(estudiante)
    }

    fun registrarEstudienteRecupera(estudiante: Estudiante){
        listaRecuperan.add(estudiante)
    }

    fun registrarEstudianteReprobado(estudiante: Estudiante){
        listaReprueban.add(estudiante)
    }


    fun imprimirListaEstudiantes(){
        for(est in listaEstudiantes){
            println(est)
        }
    }

    infix fun calcularPromedio(est: Estudiante): Double {

        var prom=(est.nota1+est.nota2+est.nota3+est.nota4+est.nota5)/5

        return prom


    }
}