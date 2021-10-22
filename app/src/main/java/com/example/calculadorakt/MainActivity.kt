package com.example.calculadorakt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var num_1: EditText? = null
    private var num_2: EditText? = null
    private var resultado: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num_1 = findViewById(R.id.num_1)
        num_2 = findViewById(R.id.num_2)
        resultado = findViewById(R.id.resultado)
    }

    fun suma(view: View?) {
        if (num_1!!.text.toString() != "" && num_2!!.text.toString() != "") {
            val a: Int = num_1!!.text.toString().toInt()
            val b: Int = num_2!!.text.toString().toInt()
            val res = a + b
            resultado!!.text = res.toString()
        } else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()
            Log.d("ERROR_SUMA", "Algún campo está vacío")
        }
    }

    fun resta(view: View?) {
        if (num_1!!.text.toString() != "" && num_2!!.text.toString() != "") {

            val a: Int = num_1!!.text.toString().toInt()
            val b: Int = num_2!!.text.toString().toInt()
            val res = a - b
            resultado!!.text = res.toString()
        } else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()
            Log.d("ERROR_RESTA", "Algún campo está vacío")
        }
    }

    fun multiplicacion(view: View?) {
        if (num_1!!.text.toString() != "" && num_2!!.text.toString() != "") {
            val a: Int = num_1!!.text.toString().toInt()
            val b: Int = num_2!!.text.toString().toInt()
            val res = a * b
            resultado!!.text = res.toString()
        } else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()
            Log.d("ERROR_MULTIPLICA", "Algún campo está vacío")
        }
    }

    fun division(view: View?) {
        if (num_1!!.text.toString() != "" && num_2!!.text.toString() != "") {
            val a: Float = num_1!!.text.toString().toInt().toFloat()
            val b: Float = num_2!!.text.toString().toInt().toFloat()
            if (b > 0) {
                val res = a / b
                resultado!!.text = res.toString()
            } else {
                Toast.makeText(this, "No es posible dividir por 0", Toast.LENGTH_SHORT).show()
                Log.d("ERROR_DIVIDE", "división por cero")
            }
        } else {
            Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()
            Log.d("ERROR_DIVIDE", "Algún campo está vacío")
        }
    }

    private fun muestraToast(mens: String) {
        Toast.makeText(this, mens, Toast.LENGTH_LONG).show()
    }

}