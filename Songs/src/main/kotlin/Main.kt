fun main(args: Array<String>) {
    val r = arrayOf(Rectangle(1,1), Rectangle(1,1),
    Rectangle(1,1), Rectangle(1,1))
    for (x in 0..3){
        r[x].width = (x + 1) * 3
        r[x].height = x + 5
        print("Площадь прямоугольника $x равна ${r[x].area}")
        println(" Это ${if(r[x].isSquare) "" else "не "}квадрат")
    }
}
