package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bundle = intent.extras

        val txtCorreo = findViewById<TextView>(R.id.correo)
        val txtContrasena = findViewById<TextView>(R.id.contrasena)

        val correo = bundle?.getString("correo")
        val contrasena = bundle?.getString("contrasena")

        txtCorreo.setText("Email: $correo")
        txtContrasena.setText("Password: $contrasena")

    }
}