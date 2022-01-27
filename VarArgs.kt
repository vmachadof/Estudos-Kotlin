fun ordenar(vararg numeros: Int): IntArray {
    return numeros.sortedArray()
}

fun main() {
    for(n in ordenar(38 , 3 , 25, 6)) {
        print("$n")
    }
}