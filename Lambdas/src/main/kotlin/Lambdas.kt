/* добавим псевдоним типа, это означает что мы можем использовать DoubleConversion вместо (Double) -> Double */
typealias DoubleConversion = (Double) -> Double

/* функция преобразования температуры по Цельсию в температуру по Фаренгейту */
fun convert(x: Double, converter: DoubleConversion): Double {
    val result = converter(x)
    println("$x преобразуется в $result")
    return result
}

/* функция возвращает одно лямбда выражение в зависимости от получаемой строки */
fun getConversionLambda(str: String): DoubleConversion {
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

/* определение параметров и возвращаемого типа, лямбда выражения */
fun combine(
    lambda1: DoubleConversion,
    lambda2: DoubleConversion
): DoubleConversion {
    /* тело функции возвращает лямбда выражение */
    return { x: Double -> lambda2(lambda1(x)) }
}

fun main() {

    /* Преобразовать 2.5 кг в фунты */
    println("Конвертировать 2.5кг в фунты: ${getConversionLambda("KgsToPounds")(2.5)}")

    /* создадим две переменные и присвоим им лямбда выражения */
    val kgsToPoundsLambda = getConversionLambda("KgsToPounds")
    val poundsToUSTonsLambda = getConversionLambda("PoundsToUSTons")

    /* передадим два лямбда выражения в функцию в качестве аргументов */
    val kgsToUSTonsLambda = combine(kgsToPoundsLambda,poundsToUSTonsLambda)

    val value = 17.4
    println("$value кг это ${convert(value,kgsToUSTonsLambda)} тонн США")

}