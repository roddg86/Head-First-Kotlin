fun main(args: Array<String>) {
    val s1 = Student("Ron", "Weasley", "Gryffindor")
    val s2 = Student("Draco", "Malfoy", house = "Slytherin")
    val s3 = s1.copy(firstName = "Fred", year = 3)
    val  s4 = s3.copy(firstName = "George")

    val array = arrayOf(s1,s2,s3,s4)
    /* Эта строка деструктуризует каждый обьект Student в массиве */
    for ((firstName, lastName, house, year) in array){
        println("$firstName $lastName is in $house year $year")
    }
}