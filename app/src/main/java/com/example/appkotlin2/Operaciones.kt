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
        if(estudiante.promedio>3.5){
            listaEstudiantes.add(estudiante)
            listaAprueban.add(estudiante)
        }else if(estudiante.promedio <3.5 && estudiante.promedio>2.5){
            listaEstudiantes.add(estudiante)
            listaRecuperan.add(estudiante)
        }else if(estudiante.promedio<2.5){
            listaEstudiantes.add(estudiante)
            listaReprueban.add(estudiante)
        }
    }

    fun registrarEstudianteAprobado(estudiante: Estudiante){
        if(estudiante.promedio>3.5)
        listaAprueban.add(estudiante)
    }

    fun registrarEstudienteRecupera(estudiante: Estudiante){
        if(estudiante.promedio>2.5 && estudiante.promedio<3.5)
        listaRecuperan.add(estudiante)
        listaEstudiantes.add(estudiante)
    }

    fun registrarEstudianteReprobado(estudiante: Estudiante){
        if(estudiante.promedio<2.5)
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