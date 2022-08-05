fun main() {
    var x = 10

    while (x > 1) {
        x = x - 1
        print(if (x < 3) "small x" else "big x")
    }
}