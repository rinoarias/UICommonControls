package com.rinoarias.uicommoncontrols

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nombre  = findViewById<EditText>(R.id.txt_nombre)
        val opc1  = findViewById<RadioButton>(R.id.opc_masculino)
        val opc2  = findViewById<RadioButton>(R.id.opc_femenino)
        val fechaNac = findViewById<EditText>(R.id.txt_fecha_nac)
        val telefono = findViewById<EditText>(R.id.txt_telefono)
        val botonEnviar = findViewById<Button>(R.id.btn_enviar)

        botonEnviar.setOnClickListener {
            val b = Bundle()
            b.putString("NOMBRE", nombre.text.toString())
            if(opc1.isChecked() == true){
                b.putString("GENERO", opc1.text.toString())
            }else{
                b.putString("GENERO", opc2.text.toString())
            }
            b.putString("FECHA_NAC", fechaNac.text.toString())
            b.putString("TELEFONO", telefono.text.toString())
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtras(b)
            startActivity(intent)
        }

    }
}