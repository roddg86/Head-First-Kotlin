fun main() {
    /* создадим массив с тремя элементами и переменную options в которой хранится ссылка на него */
    val options = arrayOf("Камень", "Ножницы", "Бумага")

    /* вызовем функцию и передадим массив в качестве аргумента */
    val gameChoice = getGameChoice(options)

    updateArray(options)
    println(options[2])

}

/* краткий вид через равно, фунция с единственным выражением */
fun getGameChoice(optionParam: Array<String>) = optionParam[(Math.random() * optionParam.size).toInt()]

/* При передаче значения функции передается ссылка на обьект, это значит что в этот обьект мы можем внести изменения */
fun updateArray(optionParam: Array<String>){
    optionParam[2] = "Dmitry"
}