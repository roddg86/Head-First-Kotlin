fun main (){
    val firemen = arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
    var firemanNo = 0

    /* нужны скобки */
    while (firemanNo < 6){
        println("Fireman номер $firemanNo равен ${firemen[firemanNo]}")
        firemanNo = firemanNo + 1
    }
}
