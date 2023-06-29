package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Autentificacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_autentificacion)

        val email = findViewById<EditText>(R.id.txt_correo)
        val contra = findViewById<EditText>(R.id.txt_contrasena)

        val btn = findViewById<Button>(R.id.btn_ingresar)

        btn.setOnClickListener {
            if (email.text.toString().isNotEmpty() && contra.text.toString().isNotEmpty()){
                irPrincipal(email.text.toString(), contra.text.toString())
            }else{
                Toast.makeText(this, "Datos Incompletos", Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun irPrincipal(correo: String, contra: String){
        val intent = Intent(this, MainActivity::class.java).apply {
            putExtra("correo",correo)
            putExtra("contrasena",contra)
        }
        startActivity(intent)
        finish()
    }
}