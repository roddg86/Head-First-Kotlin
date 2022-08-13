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

    /* Функция фильтр, отбирает коллекцию по критерию переданому в лямбда выражении */
    val vegetables = groceries.filter { it.category == "Vegetable" }
    println("vegetables: $vegetables")

    /* функция filterNot возвращает список всех элементов Grocery,
    у которых значение category отлично от «Frozen» */
    val notFrozen = groceries.filterNot { it.category == "Frozen" }
    println("notFrozen: $notFrozen")

    /* Создаем новый список List и заполняем его значениями свойства name каждого элемента Grocery в groceries */
    val groceryNames = groceries.map { it.name }
    println(groceryNames)

    /* Возвращает список List со всеми значениями unitPrice, умноженными на 0.5 */
    val halfUntPrice = groceries.map { it.unitPrice * 0.5 }
    println("halfUntPrice: $halfUntPrice")

    /* обьединение в цепочку функций высшего порядка */
    val newPrices = groceries.filter { it.unitPrice > 3.0 }
        .map { it.unitPrice * 2 }
    println("newPrices: $newPrices")

    println("Grocery names: ")
    groceries.forEach { println(it.name) }

    println("Groceries with unitPrice > 3.0: ")
    groceries.filter { it.unitPrice > 3.0 }
        .forEach { println(it.name) }

    var itemNames = ""
    groceries.forEach({ itemNames += "${it.name}" })
    println("itemNames: $itemNames")

    /* Группировка элементов коллекции */
    /* Это означает «сгруппировать элементы groceries по значению category». */
    val groupByCategory = groceries.groupBy { it.category }
    println(groupByCategory)

    groceries.groupBy { it.category }.forEach {
        /* Выводит ключи Map (значения category элементов Grocery). */
        println(it.key)
        it.value.forEach { println("    ${it.name}") }
    }

    /* суммирование значений коллекции с помощью функци fold */
    val ints = listOf(1, 2, 3)
    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    println(sumOfInts)

    /* перемножение элементов */
    val compositionOfInts = ints.fold(1) { runningSum, item -> runningSum * item }
    println(compositionOfInts)

    /* Конкатенация имен из элементов списка List<Grocery> */
    val concatName = groceries.fold("") { string, item -> string + "${item.name}" }
    println(concatName)

    /* Вычитание суммы из исходного значения */
    val sum = groceries.fold(50.0) { change, item -> change - item.unitPrice * item.quantity }
    println(sum)
}