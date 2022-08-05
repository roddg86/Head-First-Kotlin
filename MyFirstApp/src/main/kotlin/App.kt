fun main() {
    var x = 1
    println("Перед циклом. x = $x.")
    /*
    *  $x - выводит значение х
    * */
    while (x < 4) {
        println("В цикле. x = $x.")
        x = x + 1
    }
    println("После цикла. x = $x.")
}