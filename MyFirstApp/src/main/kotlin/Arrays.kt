fun main() {
    /* Инициализируем обьект массив с именем myArray, тремя значениями типа int 1, 2, 3  */
    var myArray = arrayOf(1, 2, 3)

    /* Обратимся к переменной массива чтобы получить значение элеента массива, первого элемента */
    println(myArray[0])

    /* для получения размера массива используется функция */
    myArray.size

    /* обновим значемние второго элемента */
    myArray[1] = 15
    println(myArray[1])

    /* код не будет компилироватся, потому что значение не соответсвует типу значений в массиве */
    // myArray[2] = "Fido"

    /* явное определение типа массива
    * обьявим массив для хранения значений Byte */
    var myArrayType: Array<Byte> = arrayOf(1, 2, 3)

    /* Если переменная содержит ссылку на массив, это означает, что
    переменную можно обновить, чтобы в ней хранилась ссылка на другой массив того же
    типа. */
    var myArray2 = arrayOf(1,2,3)

    /* создает новый массив с элементами int, ссылка на новый массив сохраняется в переменной myArray
    * и заменяет предыдущую ссылку */
    myArray2 = arrayOf(4, 5)
    println(myArray2[1])

    /* если val то переменная не может использоватся повторно для другого обьекта
    * при этом сам обьект можно изменять  */
    val myArrayVal = arrayOf(1,2,3)
    myArrayVal[2] = 6
    println(myArrayVal[2])


}