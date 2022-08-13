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

    /* Найдем наименьшее и наибольшее значение в коллекции обьектов */
    val ints = listOf(1, 2, 3, 4)
    val maxInt = ints.max() //maxInt = 4
    val minInt = ints.min() //maxInt = 1
    println("maxInt: $maxInt")
    println("minInt: $minInt")

    /* Найти в коллекции groceries элемент с наибольшим значением unitPrice */
    val highestUnitPrice = groceries.maxBy { it.unitPrice * 5 }
    println("highestUnitPrice: $highestUnitPrice")

    /* Найти в коллекции groceries элемент с наименьшим значением quantity */
    val lowestQuantity = groceries.minBy { it.quantity }
    println("lowestQuantity: $lowestQuantity")

    /* Найти сумму значений обьекта коллекции, возвращает сумму всех значений quantity в groceries */
    val sumQuantity = groceries.sumOf { it.quantity }
    println("sumQuantity: $sumQuantity")

    /* Возвращает сумму всех значений unitPrice уноженных на quantity */
    val totalPrice = groceries.sumOf { it.quantity * it.unitPrice }
    println("totalPrice: $totalPrice")

    /* Функция фильтр, отбирает коллекцию по критерию переданому в лямбда выражении */
    val vegetables = groceries.filter { it.category == "Vegetable" }
    println("vegetables: $vegetables")

    /* возвращает список List с элементами Grocery, у которых значение unitPrice больше 3.0 */
    val unitPriceOvar3 = groceries.filter { it.unitPrice > 3.0 }
    println("unitPriceOvar3: $unitPriceOvar3")

    /* функция filterNot возвращает список всех элементов Grocery,
    у которых значение category отлично от «Frozen» */
    val notFrozen = groceries.filterNot { it.category == "Frozen" }
    println("notFrozen: $notFrozen")
}