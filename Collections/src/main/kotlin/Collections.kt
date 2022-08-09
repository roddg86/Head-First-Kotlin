fun main(){
    /* изменяеый список */
    val mShoppingList = mutableListOf("Чай","Яйца","Молоко")
    println("mShoppingList оригинальный: $mShoppingList")

    /* неизменяемый список */
    val extraShopping = listOf("Печенье", "Сахар", "Яйца")

    /* добавим элементы неизменяемого списка в изменяемый */
    mShoppingList.addAll(extraShopping)
    println("mShoppingList элементы добавлены: $mShoppingList")

    /* Если изменяемый список содержит Tea */
    if (mShoppingList.contains("Чай")){
        /*  set - обновить значение, значение с индексом Чай заменим на значение с индексом Кофе */
        mShoppingList.set(mShoppingList.indexOf("Чай"), "Кофе")
        println("mShoppingList значение заменяно: $mShoppingList")
    }
    /* Отсортируем список в естественном порядке (по алфавиту) */
    mShoppingList.sort()
    println("mShoppingList отсортированный: $mShoppingList")

    /* Перевернутый список */
    mShoppingList.reverse()
    println("mShoppingList перевернутый: $mShoppingList")
}