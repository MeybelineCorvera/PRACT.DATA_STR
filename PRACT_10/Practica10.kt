//MEYBELINE ABIGAIL CORVERA CRUZ U20240812

class Nodo(val pregunta: String, val respuesta: String? = null){
    var izquierdo: Nodo? = null
    var derecho: Nodo? = null
}

class ArbolBinarioRPG() {
    var raiz: Nodo

    init {
        val mago = Nodo("¿Eres un Mago?", "Eres un Mago")
        val arquero = Nodo("¿Eres un Arquero?", "Eres un Arquero")
        val guerrero = Nodo("¿Eres un Guerrero?", "Eres un Guerrero")
        val asesino = Nodo("¿Eres un Asesino?", "Eres un Asesino")

        val magia = Nodo("¿Prefieres usar magia?")
        magia.izquierdo = mago
        magia.derecho = arquero

        val armas = Nodo("¿Prefieres usar armas?")
        armas.izquierdo = guerrero
        armas.derecho = asesino

        raiz = Nodo("¿Prefieres combate a distancia?")
        raiz.izquierdo = magia
        raiz.derecho = armas
    }
}

fun juego(nodo: Nodo?){
    if (nodo == null) return

    if (nodo.respuesta != null) {
        println(nodo.respuesta)
        return
    }

    println(nodo.pregunta + " (si/no)")
    val respuesta = readLine()?.trim()?.lowercase()

    if(respuesta == "si"){
        juego(nodo.izquierdo)
    } else {
        juego(nodo.derecho)
    }
}

fun main() {
    val jugador = ArbolBinarioRPG()
    println("¡Bienvenido al test de Clases de RPG!")
    juego(jugador.raiz)
}
