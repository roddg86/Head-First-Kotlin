fun main(args: Array<String>) {
    /* Изменим вызов первичного конструктора */
    val r1 = Recipe("Тайский карри", "Chicken")
    val r2 = Recipe(title = "Тайский карри", mainIngredient = "Chicken")

    /* создание копии обьекта r1 и изменение его свойства title, по итогу получаем новый обьект */
    val r3 = r1.copy(title = "Куринная бхуна")

    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    println("r3 hash code: ${r3.hashCode()}")

    println("r1 toString: ${r1.toString()}")

    /* == проверяет эквивалентность объектов. */
    /* Условие r1 == r2 истинно, потому что их объекты имеют одинаковые значения */
    println("r1 == r2? ${r1 == r2}")

    /* === проверяет тождественность объектов.
    * Оператор === всегда проверяет, ссылаются ли две переменные на один объект.*/
    /* так как переменные содержат ссылки на разные объекты, условие r1 === r2 ложно. */
    println("r1 === r2? ${r1 === r2}")

    println("r1 == r3? ${r1 == r3}")

    /* Разбираем новые свойства Recipe при деструктуризации r1 */
    val (title, mainIngredient, vegetarian, difficulty) = r1
    println("title is $title and vegetarian is $vegetarian")

    /* Создание обьета Mushroom вызовом первичного конструктора */
    val m1 = Mushroom(6, false)
    println("m1 size is ${m1.size} and isMagic is ${m1.isMagic}")

    /* Создание обьекта Mushroom вызовом вторичного конструктора */
    val m2 = Mushroom(true)
    println("m2 size is ${m2.size} and isMagic is ${m2.isMagic}")

    /* вызов int - версии addNumbers */
    println(addNumbers(2, 5))
    /* вызов Double - версии addNumbers */
    println(addNumbers(1.6, 7.3))
}