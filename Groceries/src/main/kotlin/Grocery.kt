/* Функции высшего порядка */

data class Grocery(
    val name: String,
    val category: String,
    val unit: String,
    val unitPrice: Double,
    val quantity: Int
)

fun main() {
    val groceries = listOf(
        Grocery("Tomatoes", "Vegetable", "lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice cream", "Frozen", "Pack", 3.0, 2)
    )

    groceries.groupBy { it.category }.forEach {
        /* Выводит ключи Map (значения category элементов Grocery). */
        println(it.key)
        it.value.forEach { println("    ${it.name}") }
    }

    /* суммирование значений коллекции с помощью функци fold */
    val ints = listOf(1, 2, 3)
    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    println("sumOfInts: $sumOfInts")

    val productOfInts = ints.fold(1) { runningProduct, item -> runningProduct * item }
    println("productOfInts: $productOfInts")

    val names = groceries.fold("") { string, item -> string + " ${item.name}" }
    println("names: $names")

    /* Вычитание суммы из исходного значения */
    val changeFrom50 = groceries.fold(50.0) { change, item -> change - item.unitPrice * item.quantity }
    println("changeFrom50: $changeFrom50")
}