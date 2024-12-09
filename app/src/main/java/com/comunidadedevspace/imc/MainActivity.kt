package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Recuperar os componentes EditText
        //Criar uma variavel e associar(=) o compenente de UI<>EditText
        //Recuperar o botao de tela
        //Colocare acao no botao setOnClickListener
        //Recuperar o texto digitado ono edt peso

        val edtPeso= findViewById<TextInputEditText>(R.id.edt_peso)
        val edtAltura= findViewById<TextInputEditText>(R.id.edt_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val peso= edtPeso.text
            val altura = edtAltura.text
            println("luis acao do botao" + altura)
        }


    }
}