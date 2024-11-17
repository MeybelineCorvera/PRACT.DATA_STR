// Clase CustomList<T>
class CustomList<T> {
    private val elements = mutableListOf<T>()

    fun add(element: T): Boolean {
        return if (element !in elements) {
            elements.add(element)
            println("Tarea agregada exitosamente")
            true
        } else {
            println("La tarea ya existe")
            false
        }
    }

    fun remove(element: T): Boolean {
        return if (element in elements) {
            elements.remove(element)
            println("Tarea eliminada")
            true
        } else {
            println("La tarea no se encontró en la lista")
            false
        }
    }

    fun showAll() {
        if (elements.isEmpty()) {
            println("La lista está vacía")
        } else {
            println("Lista de tareas:")
            elements.forEach { println(" - $it") }
        }
    }

    fun size(): Int {
        return elements.size
    }
}

// Main
fun main(args: Array<String>) {
    val listaTareas = CustomList<String>()
    var opcion: Int

    do {
        println("\nGestor de tareas")
        println("1. Agregar tarea")
        println("2. Eliminar tarea")
        println("3. Ver lista de tareas")
        println("4. Salir")
        println("Seleccione una opción: ")
        opcion = readLine()?.toIntOrNull() ?: 0

        when (opcion) {
            1 -> {
                println("Ingrese la nueva tarea: ")
                val nuevaTarea = readLine() ?: ""
                listaTareas.add(nuevaTarea)
            }

            2 -> {
                if (listaTareas.size() > 0) {
                    println("Seleccione la tarea que desea eliminar:")
                    listaTareas.showAll()
                    println("Ingrese el nombre exacto de la tarea: ")
                    val eliminarTarea = readLine() ?: ""
                    listaTareas.remove(eliminarTarea)
                } else {
                    println("La tarea no está en la lista")
                }
            }

            3 -> listaTareas.showAll()

            4 -> println("Saliendo del programa...")

            else -> println("Opción no válida, ingrese una opción válida.")
        }
    } while (opcion != 4)
}
