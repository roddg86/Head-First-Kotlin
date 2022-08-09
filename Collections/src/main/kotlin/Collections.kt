fun main(){

    /* изменяеый список */
    var mShoppingList = mutableListOf("Чай","Яйца","Молоко")
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

    /* скопируем список в новый обьект */
    val mShoppingSet = mShoppingList.toMutableSet()

    /* коллекция set удалила дубликаты */
    println("mShoppingSet: $mShoppingSet")

    /* создадим неизменяемую неупорядоченную коллекцию без повторяющихся значений*/
    val moreShopping = setOf("Зеленый лук", "Шпинат", "Молоко")

    /* добавим элементы неизменяемой коллекции в изменяемую */
    mShoppingSet.addAll(moreShopping)

    println("mShoppingSet элементы добавлены: $mShoppingSet")

    /* скопируем коллекцию Set в список List */
    mShoppingList = mShoppingSet.toMutableList()
    println("mShoppingList новая врсия: $mShoppingList")
}