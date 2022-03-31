package com.example.appkotlin2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Registro : AppCompatActivity(){

    var txt_nombre: EditText?=null
    var txt_identificacion: EditText?=null
    var txt_edad: EditText?=null
    var txttelefono: EditText?=null
    var txtdireccion: EditText?=null
    var txtMateria1: EditText?=null
    var txtMateria2: EditText?=null
    var txtMateria3: EditText?=null
    var txtNota1: EditText?=null
    var txtNota2: EditText?=null
    var txtNota3: EditText?=null
    var txtMateria4: EditText?=null
    var txtMateria5: EditText?=null
    var txtNota4: EditText?=null
    var txtNota5: EditText?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        iniciarComponentes()
        val buttonatras:Button=findViewById(R.id.buttonatras1)
        buttonatras.setOnClickListener{atrasmain()}
        var operaciones: Operaciones?=null
    }
    private fun atrasmain(){
        startActivity(Intent(this,MainActivity::class.java))
    }


    private fun iniciarComponentes(){
        var btnVeresultados: Button =findViewById(R.id.buttonresultados)
        btnVeresultados.setOnClickListener{registrarEstudiante()}

            var operaciones=Operaciones()
            var txt_nombre:EditText =findViewById(R.id.txnombre)
            var txt_identificacion:EditText = findViewById(R.id.textidentificacon)
            var txt_edad:EditText =findViewById(R.id.txtedad)
            var txttelefono:EditText =findViewById(R.id.txttelefono)
            var txtdireccion:EditText =findViewById(R.id.txtdireccion)


            var txtMateria1:EditText = findViewById (R.id.txtmateria1)
            var txtMateria2:EditText = findViewById(R.id.txtmateria2)
            var txtMateria3:EditText = findViewById(R.id.txtmateria3)
            var txtNota1:EditText =findViewById(R.id.txtnota1)
            var txtNota2:EditText =findViewById(R.id.txtnota2)
            var txtNota3:EditText =findViewById(R.id.txtnota3)
            var txtMateria4:EditText =findViewById(R.id.txtmateria4)
            var txtMateria5:EditText = findViewById(R.id.txtmateria5)
            var txtNota4:EditText =findViewById(R.id.txtnota4)
            var txtNota5:EditText =findViewById (R.id.txtnota5)



        }
    private fun registrarEstudiante(){

        var est:Estudiante= Estudiante()
        est.nombre=txt_nombre?.text.toString()
        est.documento= txt_identificacion?.text.toString()
        est.edad=txt_edad?.text.toString().toInt()
        est.telefono=txttelefono?.text.toString()
        est.direccion=txtdireccion?.text.toString()

        est.materia1=txtMateria1?.text.toString()
        est.materia2=txtMateria2?.text.toString()
        est.materia3=txtMateria3?.text.toString()
        est.nota1=txtNota1?.text.toString().toDouble()
        est.nota2=txtNota2?.text.toString().toDouble()
        est.nota3=txtNota3?.text.toString().toDouble()
        est.materia4=txtMateria4?.text.toString()
        est.materia5=txtMateria5?.text.toString()
        est.nota4=txtNota4?.text.toString().toDouble()
        est.nota5=txtNota5?.text.toString().toDouble()

        est.promedio=operaciones!!calcularPromedio(est)
        operaciones.registrarEstudiante(est)
        operaciones?.imprimirListaEstudiantes()

        Toast.makeText(getApplicationContext(),
        "Datos registrados con éxito",Toast.LENGTH_LONG).show()
        startActivity(Intent(this,Resultados::class.java))



        val miBundle: Bundle=Bundle()

        miBundle.putString("Nombre",est.nombre)
        miBundle.putString("Documento",est.documento)
        miBundle.putInt("Edad",est.edad)
        miBundle.putString("Telefono", est.telefono)
        miBundle.putString("Direccion", est.direccion)

        miBundle.putString("Materia1",est.materia1)
        miBundle.putString("Materia2",est.materia2)
        miBundle.putString("Materia3",est.materia3)
        miBundle.putDouble("Nota1",est.nota1)
        miBundle.putDouble("Nota2",est.nota2)
        miBundle.putDouble("Nota3",est.nota3)
        miBundle.putString("Materia4",est.materia4)
        miBundle.putString("Materia5",est.materia5)
        miBundle.putDouble("Nota4",est.nota4)
        miBundle.putDouble("Nota5",est.nota5)
        miBundle.putDouble("Promedio",est.promedio)

        intent.putExtras(miBundle)
        startActivity(intent)


    }
    }





