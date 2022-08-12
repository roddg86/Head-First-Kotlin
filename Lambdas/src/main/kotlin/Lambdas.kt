fun main() {
    var addFive = { x: Int -> x + 5 }
    println("Передавайте 6 чтобы добавить пять addFive: ${addFive(6)}")

    val addInts = { x: Int, y: Int -> x + y }
    val result = addInts.invoke(6, 7)
    println("Передавайте 6 и 7 в надстройки addInts: $result")

    val intLambda: (Int, Int) -> Int = { x, y -> x * y }
    println("Передайте 10, 11 в intLambda: ${intLambda(10, 11)}")

    val addSeven: (Int) -> Int = { it + 7 }
    println("Передайте 12, чтобы добавить семь addSeven:${addSeven(12)}")

    val myLambda: () -> Unit = { println("Привет!") }
    myLambda()
}