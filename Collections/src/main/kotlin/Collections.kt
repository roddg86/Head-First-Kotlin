fun main(){
    val petsLiam = listOf("Cat", "Dog", "Fish", "Fish")
    val petsSophia = listOf("Cat", "Owl")
    val petsNoah = listOf("Dog", "Dove", "Dog", "Dove")
    val petsEmily = listOf("Hedgehog")

    /* Напишите код для создания новой коллекции pets , в которой присутствуют все животные
    из всех списков. */
    var pets = mutableListOf<String>()

    pets.addAll(petsLiam)
    pets.addAll(petsSophia)
    pets.addAll(petsNoah)
    pets.addAll(petsEmily)
    println("Все животные из всех списков: $pets")

    /* Как бы вы использовали коллекцию pets для получения общего количества животных? */
    val numPets = pets.size
    println("Общее количество: $numPets")

    /* Напишите код для вывода количества разных видов животных. */
    val unicPets = pets.toMutableSet()
    println("Новая коллекция уникальных видов животных: $unicPets")
    val numUnicPets = unicPets.size
    println("Количество уникальных: $numUnicPets")

    /* Как бы вы перечислили разные виды животных в алфавитном порядке? */
    val AlfPets = unicPets.sorted()
    println("Коллекция уникальных животных в алфавитном порядке: $AlfPets")
}