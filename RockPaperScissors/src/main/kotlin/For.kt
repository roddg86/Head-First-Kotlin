fun main() {
    var x = 1
    while (x < 11) {
        println(x)
        x = x + 1
    }


    /* Пожалуйста, введите один из
    следующее: Камень, ножницы, бумага */
    for (x in 1..10) {
        println(x)
    }

    /*
    * Оператор .. включает завершающее число в диапазоне. Если
    вы хотите исключить его из перебора, замените оператор ..
    оператором until.
    * */
    for (x in 1 until 100) {
        println(x)
    }

    /* перебрать диапазон чисел в обратном порядке, исполь-
    зуйте downTo вместо .. или until */
    for (x in 15 downTo 1) print("$x ")

    /* увеличить размер шага при
    помощи ключевого слова step */
    for (x in 1..100 step 2) print("$x ")

    val options = arrayOf("Камень", "Ножницы", "Бумага")

    fun getUserChoice(optionParam: Array<String>){
        println("Пожалуйста, введите один из следующее: Камень, ножницы, бумага")

        /* перебрать все элементы массива optionParam */
        for (item in optionParam){
            println("$item является элементом массива")
        }

        /* выполнить перебор по индексам массива */
        for (index in optionParam.indices){
            println("Индекс $index содержит элемент ${optionParam[index]}")
        }

        /* Перебирает все элементы массива. Индекс элемента присваивается переменной index, а сам элемент - переменной item */
        for ((index, item) in optionParam.withIndex()){
            println("Индекс $index есть предмет $item")
        }
    }

    getUserChoice(options)
}