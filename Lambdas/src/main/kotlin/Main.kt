fun main(args: Array<String>) {

    /* Лямбда выражение которое прибавляет 5 к значению параметра Int */
    { x: Int -> x + 5 }

    /* Лямбда выражение которое получает два параметра */
    { x: Int, y: Int -> x + y }

    /* Лямбда выражение не получает параметров, поэтому -> можно опустить */
    {"Pow!"}
}