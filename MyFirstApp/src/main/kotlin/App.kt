fun main() {
    var x = 10 // val неизменяемая переменная

    while (x > 1) {
        x = x - 1
        if (x < 3) println("small x")
    }
}