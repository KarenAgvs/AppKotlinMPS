package com.example.appkotlin2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

   /* var operaciones: Operaciones?=null*/


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*operaciones = Operaciones()
        iniciarComponentes()*/

        val buttoniniciarregistro: Button =findViewById(R.id.buttoniniciarregistro)
        buttoniniciarregistro.setOnClickListener{onClick() }
        val buttonayuda:Button=findViewById(R.id.buttonayuda)
        buttonayuda.setOnClickListener{onClickatras()}
        val buttonestadisticas:Button=findViewById(R.id.buttonestadisticas)
        buttonestadisticas.setOnClickListener{onClickestadis()}

        }
    private fun onClickestadis(){
        startActivity(Intent(this,Estadisticas::class.java))
    }

    private fun onClickatras() {
        startActivity(Intent(this,Instrucciones::class.java))
    }

    private fun onClick() {
        startActivity(Intent(this,Registro::class.java))
    }

}







