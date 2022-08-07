fun main(args: Array<String>) {
    val myDog = Dog("Шарик", 75, "Овчарка")

    println(myDog.weightInKgs)

    myDog.weight = 90

    println(myDog.weightInKgs)
}
