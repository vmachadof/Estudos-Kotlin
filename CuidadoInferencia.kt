fun main() {
    var a = 1
    var b = 2

    a = 10
    print(a+b)
}


/** Esse código vai dar erro
 * não tem como "a" ser inferida já que não foi nada declarado nela
 *
 *
 * caso fosse:
 * fun main() {
var a = int
var b = 2

a = 10
print(a+b)
}

funcionaria, assim como está no doc Variaveis.kts
 */
