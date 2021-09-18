package com.example.convertertemperatura

class Temperatura (var celsius: Double, var  fahrenheit: Double) {


    fun converterParaFahrenheit(value: Double): Double {

        return ((celsius * 9) / 5) + 32
    }

    fun converterParaCelsius(value: Double): Double {

        return ((fahrenheit - 32) * 5 / 9)

    }

    fun modeChanged() {

    }
}