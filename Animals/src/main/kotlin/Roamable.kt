interface Roamable {
    /* Интерфейсы не могут иметь конструкторов
    * Чтобы добавить свойство, включим его в тело интерфейса */

    val velocity: Int
        get() = 20

    /* Функция в интерфейсе имеет тело, значит она конкретная */
    fun roam(){
        println("The Roamable is roaming")
    }
}