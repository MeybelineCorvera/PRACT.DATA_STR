//Meybeline Corvera U20240812

class Factura() {
    fun calcularTotal(): String {
        return "Este es el total"
    }
}

class ReporteFactura {
    fun generar(factura: Factura): String {
        return "Reporte de la factura"
    }
}

// Open/Closed Principle (OCP) - Principio Abierto/Cerrado
open class Empleado(val nombre: String, val horasTrabajadas: Int, val precioHora: Double) {
    open fun calcularSalario(): Double {
        return horasTrabajadas * precioHora
    }
}

class EmpleadoConBono(nombre: String, horasTrabajadas: Int, precioHora: Double, val bono: Double) 
    : Empleado(nombre, horasTrabajadas, precioHora) {
    override fun calcularSalario(): Double {
        return super.calcularSalario() + bono
    }
}

// Liskov Substitution Principle (LSP) - Principio de Sustitución Liskov
fun imprimirSalario(empleado: Empleado) {
    println("El salario de ${empleado.nombre} es de ${empleado.calcularSalario()}")
}

fun main(args: Array<String>) {
    val empleado = Empleado("Daniel", 40, 12.0)
    val empleadoConBono = EmpleadoConBono("Fernanda", 40, 12.0, 70.0)

    imprimirSalario(empleado)
    imprimirSalario(empleadoConBono)
}

// 4. Interface Segregation Principle (ISP) - Principio de Segregación de Interfaces

interface Trabajador{
    fun trabajar()
}

interface Asistente{
    fun asistir()
}

interface Reportero{
    fun generarReporte()
}

class Programador: Trabajador {
    override fun trabajar() {
        println("El programador está programando")
    }
}

class Albanil: Trabajador{
    override fun trabajar() {
        // Agregar de trabajo
    }
}

// 5. Dependency Inversion Principle (DIP) - Principio de Inversion de Dependencias

interface Notificaciones{
    fun enviarNotificacion(mensaje: String)
}

class ServicioEmail: Notificaciones{
    override fun enviarNotificacion(mensaje: String){
        println("Enviando Email: $mensaje")
    }
}

class Notificacion(val servicio: Notificaciones){
    fun enviarNotificacion() {
        servicio.enviarNotificacion("Notificación importante")
    }
}
