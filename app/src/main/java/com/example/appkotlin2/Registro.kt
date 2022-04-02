package com.example.appkotlin2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Registro : AppCompatActivity(){

    var txt_nombre:EditText?=null
    var txt_identificacion:EditText?=null
    var txt_edad:EditText?=null
    var txttelefono:EditText?=null
    var txtdireccion:EditText?=null
    var txtMateria1:EditText?=null
    var txtMateria2:EditText?=null
    var txtMateria3:EditText?=null
    var txtNota1:EditText?=null
    var txtNota2:EditText?=null
    var txtNota3:EditText?=null
    var txtMateria4:EditText?=null
    var txtMateria5:EditText?=null
    var txtNota4:EditText?=null
    var txtNota5:EditText?=null



    var operaciones : Operaciones?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        iniciarComponentes()
        val buttonatras:Button=findViewById(R.id.buttonatras1)
        buttonatras.setOnClickListener{atrasmain()}

    }
    private fun atrasmain(){
        startActivity(Intent(this,MainActivity::class.java))
    }


    private fun iniciarComponentes(){

        val btnResultants: Button =findViewById(R.id.buttonresultados)
        btnResultants.setOnClickListener{registrarEstudiante()}

        operaciones = Operaciones()

        txt_nombre=findViewById(R.id.txnombre)
        txt_identificacion = findViewById(R.id.textidentificacon)
        txt_edad =findViewById(R.id.txtedad)
        txttelefono=findViewById(R.id.txttelefono)
        txtdireccion= findViewById(R.id.txtdireccion)


        txtMateria1= findViewById (R.id.txtmateria1)
        txtMateria2=findViewById(R.id.txtmateria2)
        txtMateria3 = findViewById(R.id.txtmateria3)
        txtNota1 =findViewById(R.id.txtnota1)
        txtNota2=findViewById(R.id.txtnota2)
        txtNota3=findViewById(R.id.txtnota3)
        txtMateria4 =findViewById(R.id.txtmateria4)
        txtMateria5= findViewById(R.id.txtmateria5)
        txtNota4=findViewById(R.id.txtnota4)
        txtNota5 =findViewById (R.id.txtnota5)


        }


    private fun registrarEstudiante() {

        val est: Estudiante = Estudiante()
        est.nombre = txt_nombre?.text.toString()
        est.documento = txt_identificacion?.text.toString()
        est.edad = txt_edad?.text.toString().toInt()
        est.telefono = txttelefono?.text.toString()
        est.direccion = txtdireccion?.text.toString()

        est.materia1 = txtMateria1?.text.toString()
        est.materia2 = txtMateria2?.text.toString()
        est.materia3 = txtMateria3?.text.toString()
        est.nota1 = txtNota1?.text.toString().toDouble()
        est.nota2 = txtNota2?.text.toString().toDouble()
        est.nota3 = txtNota3?.text.toString().toDouble()
        est.materia4 = txtMateria4?.text.toString()
        est.materia5 = txtMateria5?.text.toString()
        est.nota4 = txtNota4?.text.toString().toDouble()
        est.nota5 = txtNota5?.text.toString().toDouble()

        if (est.nota1 < 0 || est.nota2 < 0 || est.nota3 < 0 || est.nota4 < 0 || est.nota5 < 0) {
            Toast.makeText(
                getApplicationContext(),
                "Ingresa una nota válida (Entre 1 y 5)", Toast.LENGTH_LONG
            ).show()
        }

        else if (est.nota1 > 5 || est.nota2 > 5 || est.nota3 > 5 || est.nota4 > 5 || est.nota5 > 5) {
                Toast.makeText(
                    getApplicationContext(),
                    "Ingresa una nota válida (Entre 1 y 5)", Toast.LENGTH_LONG
                ).show()

        } else {

                est.promedio = operaciones!! calcularPromedio (est)
                operaciones!!.registrarEstudiante(est)
                operaciones?.imprimirListaEstudiantes()
            operaciones.

                startActivity(Intent(this, Resultados::class.java))

                Toast.makeText(
                    getApplicationContext(),
                    "Datos registrados con éxito", Toast.LENGTH_LONG
                ).show()

            }

            val miBundle: Bundle = Bundle()

            miBundle.putString("Nombre", est.nombre)
            miBundle.putString("Documento", est.documento)
            miBundle.putInt("Edad", est.edad)
            miBundle.putString("Telefono", est.telefono)
            miBundle.putString("Direccion", est.direccion)

            miBundle.putString("Materia1", est.materia1)
            miBundle.putString("Materia2", est.materia2)
            miBundle.putString("Materia3", est.materia3)
            miBundle.putDouble("Nota1", est.nota1)
            miBundle.putDouble("Nota2", est.nota2)
            miBundle.putDouble("Nota3", est.nota3)
            miBundle.putString("Materia4", est.materia4)
            miBundle.putString("Materia5", est.materia5)
            miBundle.putDouble("Nota4", est.nota4)
            miBundle.putDouble("Nota5", est.nota5)
            miBundle.putDouble("Promedio", est.promedio)

            intent.putExtras(miBundle)
            startActivity(intent)





        }


        /*val miBundle: Bundle = Bundle()

        miBundle.putString("Nombre", est.nombre)
        miBundle.putString("Documento", est.documento)
        miBundle.putInt("Edad", est.edad)
        miBundle.putString("Telefono", est.telefono)
        miBundle.putString("Direccion", est.direccion)

        miBundle.putString("Materia1", est.materia1)
        miBundle.putString("Materia2", est.materia2)
        miBundle.putString("Materia3", est.materia3)
        miBundle.putDouble("Nota1", est.nota1)
        miBundle.putDouble("Nota2", est.nota2)
        miBundle.putDouble("Nota3", est.nota3)
        miBundle.putString("Materia4", est.materia4)
        miBundle.putString("Materia5", est.materia5)
        miBundle.putDouble("Nota4", est.nota4)
        miBundle.putDouble("Nota5", est.nota5)
        miBundle.putDouble("Promedio", est.promedio)

        intent.putExtras(miBundle)
        startActivity(intent)*/

    }









