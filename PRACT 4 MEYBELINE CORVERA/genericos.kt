//MEYBELINE ABIGAIL CORVERA CRUZ

//Ejemplo 1
class Caja<T>(val contenido: T) {
    fun obtenerContenido(): T {
        return contenido
    }
}

//Ejemplo 2
fun <T> imprimirDato(elemento: T) {
    println(elemento)
}

//Ejemplo 3
fun <T : Number> sumar(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

//Ejemplo 4
fun <T> imprimirSiEsNumero(valor: T) where T : Number {
    println(valor.toDouble())
}


fun main(args: Array<String>) {

    val cajaInt = Caja(42.4156451)
    val cajaString = Caja("Soy una cadena")
    val nombre = "daniel"
    val otro = 45657
    val suma = sumar(10.7541, 45)

    println("====== Ejemplo 1 ======")
    println(cajaInt.obtenerContenido())
    println(cajaString.obtenerContenido())
    println("===== Fin de Ejemplo 1 =====")

    println("====== Ejemplo 2 ======")
    imprimirDato(nombre)
    println("===== Fin de Ejemplo 2 =====")

    println("====== Ejemplo 3 ======")
    println("La suma es: ${suma}")
    println("===== Fin de Ejemplo 3 =====")

    println("====== Ejemplo 4 ======")
    imprimirSiEsNumero(suma)
    println("===== Fin de Ejemplo 4 =====")
}
