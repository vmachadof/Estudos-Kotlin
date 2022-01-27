fun main() {
    val num1: Int = 2
    val num2: Int = 3

    val maiorValor = if (num1 > num2) {
        println("processando...")
        num1 }
    else {
        println("processando...")
        num2
    }
    println("O maior valor é $maiorValor.")
}
// ou pode ser encurtado para
/**
ou pode ser encurtado para:
fun main() {
val num1: Int = 2
val num2: Int = 3

val maiorValor = if (num1 > num2) num 1 else num 2
println("O maior valor é $maiorValor.")
**/