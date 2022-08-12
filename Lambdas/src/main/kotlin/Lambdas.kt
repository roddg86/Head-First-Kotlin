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

    /* функция возвращает одно лямбда выражение в зависимости от получаемой строки */
    fun getConversionLambda(str: String): (Double) -> Double {
        if (str == "CentigradeToFahrenheit") {
            return { it * 1.8 + 32 }
        } else if (str == "KgsToPounds") {
            return { it * 2.204623 }
        } else if (str == "PoundsToUSTons") {
            return { it / 2000.0 }
        } else {
            return { it }
        }
    }

    /* пересчет киллограммы в фунты */
    val pounds = getConversionLambda("KgsToPounds")(2.5)
    println(pounds)

    /* функция getConversionLambda используется для получения лямбда-выражения, преобразующего
     температуру из шкалы Цельсия в шкалу Фаренгейта, после чего передает ее функции convert: */
    convert(20.0, getConversionLambda("CentigradeToFahrenheit"))
}