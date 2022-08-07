fun main(args: Array<String>) {

    /* Создаем три обьекта Song */
    val songOne = Song("Месопотамцы", "Они могут быть великанами")
    val songTwo = Song("Уходя в подполье", "Джем")
    val songThree = Song("Заставь меня улыбнуться", "Стив Харли")

    songOne.play()
    songTwo.stop()
    songThree.play()

}