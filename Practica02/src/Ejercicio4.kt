/*
Ejercicio 4: Crea un programa que permita al usuario ingresar 4 números enteros y los
almacene en un array. Luego, encuentra y muestra el número mayor del array.
Usa trycatch para manejar entradas no numéricas.
*/

fun main() {
    val numbers = IntArray(4)
    var validInput: Boolean

    for (i in numbers.indices) {
        validInput = false
        while (!validInput) {
            print("Ingresa el número ${i + 1}: ")
            val input = readLine()

            try {
                numbers[i] = input?.toInt() ?: 0
                validInput = true
            } catch (e: NumberFormatException) {
                println("Entrada no válida. Por favor, ingresa un número entero.")
            }
        }
    }

    val maxNumber = numbers.maxOrNull()
    println("El número mayor del array es: $maxNumber")
}