fun main(args: Array<String>) {

    /* ding ding ba-da-bing!
    bang bang bang!
    ding ding ba-da-bing! */

    /* Создаем экземпляр класса */
    val d = DrumKit(true, true)

    /* Компилятор создал за нас пустой конструктор для класса Duck
    * Вызываем пустой конструктор для создания экземпляра Duck
    * */
    var myDuck = Duck()

    d.playTopHat()
    d.playSnare()

    d.hasSnare = false

    d.playTopHat()
    d.playSnare()
}