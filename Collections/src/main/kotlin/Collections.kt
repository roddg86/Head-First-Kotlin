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

    /* Создадим пять обьектов */
    val r1 = Recipe("Куриный суп")
    val r2 = Recipe("Салат с лебедой")
    val r3 = Recipe("Тайское карри")
    val r4 = Recipe("Джамбалайя")
    val r5 = Recipe("Сосиски")

    /* создадим изменяемый массив MutableMap с тремя элементами */
    val mRecipeMap = mutableMapOf("Recipe1" to r1, "Recipe2" to r2, "Recipe3" to r3)
    println("mRecipeMap оигинал: $mRecipeMap")

    /* Добавим сразу несколько пар ключ и значение с помошью (putAll) в наш изменяемый массив */
    val recipeToAdd = mapOf("Recipe4" to r4, "Recipe5" to r5)
    mRecipeMap.putAll(recipeToAdd)
    println("mRecipeMap обновленная: $mRecipeMap")

    /* если наш изменяемый массив содержит ключь Recipe1 тогда получим значение Value и напечатаем в консоль */
    if (mRecipeMap.containsKey("Recipe1")){
        println("Recipe1 is: ${mRecipeMap.getValue("Recipe1")}")
    }
}