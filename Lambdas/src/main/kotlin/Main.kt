fun main(args: Array<String>) {

    /* Определим переменную и присвоим ей лямбда выражение */
    val addInts = { x: Int, y: Int -> x + y }

    /* Выполним лямбда выражение, вызвав его функцию invoke */
    val result = addInts.invoke(6, 7)

    /* Выполнить лямбда выражение в сокращенной форме */
    val result2 = addInts(6, 7)

    /* тоже самое */
    val result3 = addInts.invoke(6, 7)
}