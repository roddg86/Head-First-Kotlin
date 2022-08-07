/* То, что объект знает
о себе, — свойства.
То, что объект может
сделать, — его функции. */

class Dog(val name: String, var weight: Int, breed_param: String) {

    /* добавим еще одно свойство в теле класса а не через конструктор */
    var activities = arrayOf("Прогулки")

    /* Берет значение breed_param, преобразует
    его к верхнему регистру и присваивает
    свойству breed. */
    val breed = breed_param.toUpperCase()

    /* пользовательский get метод */
    val weightInKgs: Double
        /* Get-метод получает значение параметра weight
        и делит его на 2,2, чтобы вычислить значение в килограммах. */
        get() = weight / 2.2


    /* функция класса */
    fun bark() {
        println(if (weight < 20) "Ага!" else "Гав!")
    }
}