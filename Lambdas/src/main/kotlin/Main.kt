fun main(args: Array<String>) {

    /* Лямбда выражение которое прибавляет 5 к значению параметра Int */
    { x: Int -> x + 5 }

    /* Лямбда выражение которое получает два параметра */
    { x: Int, y: Int -> x + y }

    /* Лямбда выражение не получает параметров, поэтому -> можно опустить */
    { "Pow!" }

    /* Присвоим лямда выражение переменной addFive */
    val addFive = { x: Int -> x + 5 }

    /* Изменяемая переменная */
    var addY = { x: Int -> x + 5 }

    /* Обновим переменную другой лямбдой */
    addY = { y: Int -> 5 + y }
}