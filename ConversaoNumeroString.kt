fun main() {
    val a = 1


    //Numero para string
    println(a.toString() + 1)

    //String para Numero
    println("1.9".toDouble() + 3)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull() ?: 0)
    println("1".toInt() + 3)

}