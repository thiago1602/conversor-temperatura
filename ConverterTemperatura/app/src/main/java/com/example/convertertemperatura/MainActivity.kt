package com.example.convertertemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var edtCelsiusDegrees: EditText
    lateinit var edtFahDegrees: EditText
    lateinit var celsiusDegrees: TextView
    lateinit var fahDegrees: TextView
    lateinit var temperatura: Temperatura

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtCelsiusDegrees = findViewById(R.id.edtCelsius)
        celsiusDegrees = findViewById(R.id.textView2)
        edtFahDegrees = findViewById(R.id.edtFah)
        fahDegrees = findViewById(R.id.textView)

        edtCelsiusDegrees.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                temperatura.converterParaCelsius(getValue(s.toString()))

            }

            override fun afterTextChanged(s: Editable?) {

            }
        })

        edtFahDegrees.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {


                temperatura.converterParaFahrenheit(getValue(s.toString()))
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }

    private fun getValue(s: String): Double {
        s.toDoubleOrNull().let {
          return  if (it == null) {
              0.0
          } else
                it
        }
    }


    fun onChangedButtonPressed(view: View) {
        temperatura.modeChanged()

    }

}