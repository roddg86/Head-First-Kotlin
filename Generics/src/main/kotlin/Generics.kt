class Generics {

    /* Создание экземпляра обобщенного класса. */
    val duckList: MutableList<Duck>
    duckList = mutableListOf(Duck("Donald"), Duck("Daisy"), Duck("Daffy"))
    val list = mutableListOf("Fee", "Fi", "Fum")

    /* Создание функции, получающей обобщенный тип. */
    fun quack(ducks: MutableList<Duck>) {
        //...
    }

    /* Создание функции, возвращающей обобщенный тип. */
    fun getDucks(breed: String): MutableList<Duck> {
        //Получение объектов Duck нужного вида
    }
}