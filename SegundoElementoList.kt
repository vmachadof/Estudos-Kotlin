fun <E> List<E>.secondOrNull(): E? = if(this.size >= 2) this.get(1) else null

fun main() {
    val list = listOf("Cleiton", "Cleide", "Fagner")
    print(list.secondOrNull())
}