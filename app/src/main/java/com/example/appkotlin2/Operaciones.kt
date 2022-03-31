package com.example.appkotlin2

class Operaciones  {


    var listaEstudiantes: ArrayList<Estudiante> =arrayListOf<Estudiante>()
    var ListaAprueban: ArrayList<Estudiante> = arrayListOf<Estudiante>()
    var ListaRecuperan: ArrayList<Estudiante> = arrayListOf<Estudiante>()
    var ListaReprueban: ArrayList<Estudiante> = arrayListOf<Estudiante>()


    fun registrarEstudiante(estudiante: Estudiante){

        if(estudiante.promedio>3.5)
        listaEstudiantes.add(estudiante)
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