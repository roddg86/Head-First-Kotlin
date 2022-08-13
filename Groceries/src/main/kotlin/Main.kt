data class Pizza(val name: String, val pricePerSlice: Double, val quantity: Int)

fun main(args: Array<String>) {
    val ints = listOf(1, 2, 3, 4, 5)

    val pizzas = listOf(
        Pizza("Sunny Chicken", 4.5, 4),
        Pizza("Goat and Nut", 4.0, 1),
        Pizza("Tropical", 3.0, 2),
        Pizza("The Garden", 3.5, 3)
    )

    val minInt = ints.min()
    println(minInt)
    val minInt2 = ints.minBy { int: Int -> int }
    println(minInt2)
    val sumInts = ints.sum()
    println(sumInts)
    val sumInts2 = ints.sumBy { it }
    println(sumInts2)
    val sumInts3 = ints.sumByDouble { it.toDouble() }
    println(sumInts3)
    val sumInts4 = ints.sumByDouble { int: Int -> int.toDouble() }
    println(sumInts4)

    /*val lowPrice = pizzas.min()*/
    val lowPrice2 = pizzas.minBy { it.pricePerSlice }
    println(lowPrice2)
    val highQuantity = pizzas.maxBy { p: Pizza -> p.quantity }
    println(highQuantity)
    val highQuantity3 = pizzas.maxBy { it.quantity }
    println(highQuantity3)
    val totalPrice = pizzas.sumOf { it.pricePerSlice * it.quantity }
    println(totalPrice)
    val totalPrice2 = pizzas.sumOf { it.pricePerSlice * it.quantity }
    println(totalPrice2)
}