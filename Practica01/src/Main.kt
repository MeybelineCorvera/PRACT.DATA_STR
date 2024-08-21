
fun main() {
    println("Ingrese el primer numero")
    val numeroUno = readLine()?.toDoubleOrNull()

    println("Ingrese el segundo numero")
    val numeroDos = readLine()?.toDoubleOrNull()

    println("Ingrese la operacion (+, -, *, /, ^) :")
    val operacion = readLine()

    calculate(numeroUno, numeroDos, operacion)
}

fun calculate(numeroUno: Double?, numeroDos: Double?, operacion: String?) {
    if (numeroUno == null || numeroDos == null || operacion == null) {
        println("Error: Ingrese numeros validos y una operacion valida.")
        return
    }

    val resultado = try {
        when (operacion) {
            "+" -> numeroUno + numeroDos
            "-" -> numeroUno - numeroDos
            "*" -> numeroUno * numeroDos
            "/" -> if (numeroDos != 0.0) numeroUno / numeroDos else throw ArithmeticException("División por cero")
            "^" -> Math.pow(numeroUno, numeroDos)
            else -> {
                println("Error: Operación no válida.")
                return
            }
        }
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        return
    }

    println("Resultado de la operacion $numeroUno $operacion $numeroDos = $resultado")
}