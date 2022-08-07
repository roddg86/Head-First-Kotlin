/* То, что объект знает
о себе, — свойства.
То, что объект может
сделать, — его функции. */

class Dog(val name: String, var weight: Int, val breed: String) {
    /* функция класса */
    fun bark() {
        println(if (weight < 20) "Ага!" else "Гав!")
    }
}