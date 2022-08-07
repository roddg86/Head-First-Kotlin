/*
Если суперкласс поме-
чен как абстрактный,
объявлять его открытым
не обязательно.
 */
abstract class Animal: Roamable {
    abstract val image: String
    abstract val food: String
    abstract val habitat: String
    var hunger = 10

    abstract fun makeNoise()

    abstract fun eat()

    /* переопределение функции roam() из интерфейса Roamable */
    override fun roam() {
        println("Животоное бродит")
    }

    fun sleep() {
        println("Животное спит")
    }
}