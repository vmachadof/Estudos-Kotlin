fun souEsperto(x: Any) {
    if (x is String) {
        println(x.toUpperCase())
    } else if (x is Int) {
        println(x.plus(3))
    }
}

fun souEsperto2(x: Any) {
    when(x){
        is String -> println(x.toUpperCase())
        is Int -> println(x.plus(3))
        else -> println("Repense sua vida!")
    }
}


fun main() {
    souEsperto("Ola")
    souEsperto("Vitoria")

    souEsperto2("Quer Casar comigo?")
    souEsperto2("Sim ou não")

}