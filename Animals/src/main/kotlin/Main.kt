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

    /* Создание масива Roamable */
    /* Когда код перебирает элементы массива roamables, для каждого элемента
    вызывается функция roam, но функция eat вызывается только для объектов Animal. */
    val roamables = arrayOf(Hippo(), Wolf(), Vehicle())
    for (item in roamables){
        item.roam()
        /* Выполняется умное приведение типа item в Animal на время выполнения этого блока */
        if (item is Animal){
            /* Для каждого обьекта Animal в массиве вызывается функция eat() */
            item.eat()
        }
    }
}