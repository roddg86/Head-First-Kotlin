fun main() {
    val mass = arrayOf(1,2,3,4,5)

    println(maxValue(mass))
}

/* Некомпелировался из за того что неуказан тип возвращаемого значения в функции */
fun maxValue(args: Array<Int>): Int {
    var max = args[0]
    var x = 1
    while (x < args.size){
        var item = args[x]
        max = if (max >= item) max else item
        x = x + 1
    }
    return max
}