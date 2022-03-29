package com.example.appkotlin2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttoniniciarregistro: Button =findViewById(R.id.buttoniniciarregistro)
        buttoniniciarregistro.setOnClickListener{OnClick() }
        val buttonayuda:Button=findViewById(R.id.buttonayuda)
        buttonayuda.setOnClickListener{OnClickAtras()}
        val buttonestadisticas:Button=findViewById(R.id.buttonestadisticas)
        buttonestadisticas.setOnClickListener{OnClickEstadis()}

        }
    private fun OnClickEstadis(){
        startActivity(Intent(this,Estadisticas::class.java))
    }

    private fun OnClickAtras() {
        startActivity(Intent(this,Instrucciones::class.java))
    }

    private fun OnClick() {
        startActivity(Intent(this,Registro::class.java))
    }

}







