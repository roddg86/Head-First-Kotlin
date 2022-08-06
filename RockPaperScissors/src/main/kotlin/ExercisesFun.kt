fun main() {
    doSomefing("Привет", 7)
}

fun doSomefing(msg: String, i: Int) {
    if (i > 0) {
        var x = 0
        while (x < i) {
            println(msg)
            x = x + 1
        }
    }
}