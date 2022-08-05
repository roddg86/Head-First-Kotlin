fun main() {
    /* Fruit = Banana
    *  Fruit = Blueberry
    *  Fruit = Pomegranate
    *  Fruit = Cherry */

    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")

    var x = 0
    while (x < 4) {
        val index = arrayOf(1, 3, 4, 2)
        var y: Int
        y = index[x]
        println("Fruit = ${fruit[y]}")
        x = x + 1
    }
}
