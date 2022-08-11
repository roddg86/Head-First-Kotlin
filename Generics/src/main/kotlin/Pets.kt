abstract class Pet(var name: String)

class Cat(name: String) : Pet(name)

class Dog(name: String) : Pet(name)

class Fish(name: String) : Pet(name)

class Contest<T: Pet>{

    val scores: MutableMap<T, Int> = mutableMapOf()
    fun addScore(t: T, score: Int = 0){
        if(score >= 0) scores.put(t, score)
    }

    fun getWinners(): MutableSet<T>{
        val highScore = scores.values.max()
        val winners: MutableSet<T> = mutableSetOf()
        for ((t, score) in scores){
            if (score == highScore) winners.add(t)
        }
        return winners
    }

}

/* Определение интерфейса Retailer

Использует обобщенный тип Т

который используется как возвращаемый тип функции sell

*/
interface Retailer<T>{
    fun sell(): T
}

fun main(){
    /* Создание двух обьектов Cat и обьекта Fish */
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGray")

    /* Создание обькта Конкурс, предназначенного только для Cat */
    val catContest = Contest<Cat>()
    catContest.addScore(catFuzz,50)
    catContest.addScore(catKatsu, 56)
    val topCat = catContest.getWinners().first()
    println("Победительница конкурса кошек ${topCat.name}")

    /* Создание обькта Конкурс, предназначенного только для Pet */
    val petContest = Contest<Pet>()
    petContest.addScore(catFuzz,50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    println("Победитель конкурса домашних животных ${topPet.name}")

}

