data class Grocery(
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double,
    val quantity: Int
)

fun main() {
    val griceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    /* Найдем наименьшее и наибольшее значение в коллекции обьектов */
    val ints = listOf(1, 2, 3, 4)
    val maxInt = ints.max() //maxInt = 4
    val minInt = ints.min() //maxInt = 1
    println(maxInt)
    println(minInt)

    /* Найти в коллекции groceries элемент с наибольшим значением unitPrice */
    val highestUnitPrice = griceries.maxBy { it.unitPrice }
    println(highestUnitPrice)

    /* Найти в коллекции groceries элемент с наименьшим значением quantity */
    val lowestQuantity = griceries.minBy { it.quantity }
    println(lowestQuantity)
}