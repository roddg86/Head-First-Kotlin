fun main(args: Array<String>) {

    /* Создадим лямбда выражение и сохраним его в переменной */
    val addInts = { x: Int, y: Int -> x + y }

    /* Выполним лямбда выражение и передадим ему значения 6,7 */
    val result = addInts(6, 7)
}