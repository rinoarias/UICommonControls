package com.rinoarias.uicommoncontrols

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val b = intent.extras
        var nombre = b?.getString("NOMBRE")
        var genero = b?.getString("GENERO")
        var fechaNac = b?.getString("FECHA_NAC")
        var telefono = b?.getString("TELEFONO")

        var texto = findViewById<TextView>(R.id.txt_resultado)
        texto.setText("Bienvenido " + nombre + ".\nEres del genero " + genero +
                ".\nNaciste el " + fechaNac + "\nTu numero de telefono es " + telefono)

        var btnRegresar = findViewById<Button>(R.id.btn_regresar)
        btnRegresar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}