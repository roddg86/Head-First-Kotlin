fun main() {
    /* создадим массив с тремя элементами и переменную options в которой хранится ссылка на него */
    val options = arrayOf("Камень", "Ножницы", "Бумага")

    /* вызовем функцию и передадим массив в качестве аргумента */
    val gameChoice = getGameChoice(options)

    val userChoice = getUserChoice(options)

    val printRes = printResult(gameChoice, userChoice)

}

/* краткий вид через равно, фунция с единственным выражением
*
* получить выбор от компьютера
* */
fun getGameChoice(optionParam: Array<String>) = optionParam[(Math.random() * optionParam.size).toInt()]

/* получению варианта, выбранного пользователем.
*
*  Массив options будет передаваться в пара-
метре функции getUserChoice, которая возвращает вариант, выбранный
пользователем (в виде String)*/
fun getUserChoice(optionParam: Array<String>): String{
    /* переменная будет показывать ввел ли пользователь допустимый вариант */
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice){
        /*запросить у пользователя его выбор */
        println("Пожалуйста, введите один из следующих:")

        /*  выводим значение каждого элемента в массиве */
        for (item in optionParam) print(" $item")
        println(".")

        /*  прочитаем ответ полльзователя
         *
         * readLine() - функция читает строку анных из стандартного входного потока
         *  */
        val  userInput = readLine()

        /* проверить пользовательский ввод
        *
        * проверяем, что ввод пользователя отличен от null и что он присутствует в массиве options
        * */
        if (userInput != null && userInput in optionParam){
            /* если ввод пользователя прошел проверку цикл прерывается */
            isValidChoice = true
            userChoice = userInput
        }

        /* если выбран недопустимый вариант сообщить пользователю */
        if (!isValidChoice) println("Вы должны ввести правильный выбор")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoie: String){
    val result: String
    /* Определить результат */
    if (userChoice == gameChoie) result = "Ничья!"
    else if ((userChoice == "Камень" && gameChoie == "Ножницы") ||
            (userChoice == "Бумага" && gameChoie == "Камень") ||
            (userChoice == "Ножницы" && gameChoie == "Бумага")) result = "Комьютер победил!"
    else result = "Компьютер проиграл!"
    /* Вывести результат */
    println("Компьютер выбрали $userChoice Я выбрал $gameChoie $result")
}
