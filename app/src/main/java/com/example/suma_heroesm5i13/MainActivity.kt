package com.example.suma_heroesm5i13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.text.NumberFormat
import java.util.Locale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
fun suma(num1: Double, num2: Float): Double {
    return num1 + num2
}

fun redondeo(num: Double): Double {
    return kotlin.math.ceil(num)
}

fun muestraResultado(num: Double) {
    val formatoMoneda = NumberFormat.getCurrencyInstance(Locale("es", "CL"))
    val resultadoFormateado = formatoMoneda.format(num)
    println("El resultado en formato de moneda es: $resultadoFormateado")
}

fun main() {
    val resultadoSuma = suma(10.5, 5.3f)
    println("El resultado de la suma es: $resultadoSuma")

    val numeroRedondeo = 15.8
    val resultadoRedondeo = redondeo(numeroRedondeo)
    println("El número $numeroRedondeo redondeado hacia arriba es: $resultadoRedondeo")

    val numeroMoneda = 1234.56
    muestraResultado(numeroMoneda)
}