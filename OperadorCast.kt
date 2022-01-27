fun imprimirConceito(nota: Any) {
    when(nota as Int) {
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("Ruim demais, boy")
        else -> println("Nota inválida")
    }
}
fun main() {
    val notas = arrayOf(9.6, 3.8, 7.2, 5.5, 1.7)
    for (nota in notas) {
        imprimirConceito(nota.toInt())
    }
}


//toInt fez os valores Double se tornarem Int
