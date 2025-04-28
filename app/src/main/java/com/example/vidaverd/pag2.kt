package com.example.vidaverd

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class pag2 : AppCompatActivity() {

    lateinit var fornecedor: Button
    lateinit var cliente: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pag2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fornecedor = findViewById(R.id.fornecedor)

        fornecedor.setOnClickListener {
            val intent = Intent(this, TelaFornecedor::class.java)
            startActivity(intent)
        }

        cliente = findViewById(R.id.cliente)

        cliente.setOnClickListener {
            val intent = Intent(this, TelaCliente::class.java)
            startActivity(intent)
        }
    }
}
