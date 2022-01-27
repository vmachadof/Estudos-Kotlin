inline fun transacao(funcao: () -> Unit) {
    println("abrindo transação...")
    try {
        funcao()
    } finally {
        println("fechando transação")
    }
}

fun main() {
    transacao {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
        println("Executando SQL 3...")
    }
}