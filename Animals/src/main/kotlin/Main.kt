fun main(args: Array<String>) {
    /* Полиморфизм означает «много форм». Этот
    механизм позволяет разным подклассам
    переопределять разные реализации одной функции. */

    val animals = arrayOf(Hippo(), Wolf())
    /* В цикле перебирается массив с элементами Animal */
    for (item in animals) {
        item.roam()
        item.eat()
    }

    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()

    /* Вызывается функция giveShot
   * класса Vet, которой передается два подкласса Animal */
    vet.giveShot(wolf)
    vet.giveShot(hippo)
}