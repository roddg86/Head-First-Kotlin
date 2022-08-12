fun main() {

    /* функция преобразования температуры по Цельсию в температуру по Фаренгейту */
    fun convert(x: Double, converter: (Double) -> Double): Double {
        val result = converter(x)
        println("$x преобразуется в $result")
        return result
    }

    /* вызов функции аргументом которой будет лямбда выражение */
    convert(20.0) { c: Double -> c * 1.8 + 32 }

    /* краткая запись */
    val fahrenheit = convert(36.6) { it * 1.8 + 32 }

    fun convertFive(converter: (Int) -> Double): Double {
        val result = converter(5)
        println("5 преобразуется в $result")
        return result
    }

    /* краткая запись, при вызове функции мы не используем круглые скобки потому что единственный параметр это лямбда */
    convertFive {
        it * 1.8 + 32
    }
    convert(22.0) { it * 1.8 + 32 }

}