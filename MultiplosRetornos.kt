import java.util.*

data class Horario(val hora:Int, val minuto: Int, val segundo: Int)

fun agora(): Horario {
    val agora = Calendar.getInstance()

    with(agora) {
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}
// com o with pode fazer isso ali ja que vai entender que tudo vem do agora

fun main() {
    val (h, m, s) = agora()
    println("$h:$m:$s")
}


