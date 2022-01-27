fun main() {
    // Tipos numéricos inteiros
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_854_775_807 // Pode substituir por "Long.MAX.VALUE" e nas outras também

    // Tipos numéricos Reais
    val num5: Float =
        3.14F // Mesmo tamanho do Int. Precisa ser especificada com o "F" no fim, senão vai ser lida como Double
    val num6: Double = 3.14 // Mesmo tamanho do long

    // Tipo Caractere
    val char: Char = '?' // Outros exemplos... '1', 'g', ''

    //Tipo booleano
    val boolean: Boolean = true // ou falso // Boolean não pode se 1 ou 0


    println(listOf(num1, num2, num3, num4, num5, num6, char, boolean))

    println(2 is Int)
    println(2_147_483_687 is Long)
    println(1.0 is Double)
}