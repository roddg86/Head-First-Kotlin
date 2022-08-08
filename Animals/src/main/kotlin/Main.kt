fun main(args: Array<String>) {
    val f = arrayOf(Bird(), Plane(), Superhero())
    var x = 0
    /* Команды when удобны в ситуациях, когда значение переменной нужно проверить
    по набору вариантов. По сути, они работают как цепочки выражений
    if/else, но этот синтаксис получается более компактным и понятным. */
    while (x in 0..2) {
        when (f[x]) {
            is Bird -> {
                x++
                f[x].fly()
            }

            is Plane, is Superhero -> f[x].fly()
        }
        x++
    }
}