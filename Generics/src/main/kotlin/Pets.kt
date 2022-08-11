abstract class Pet(var name: String)

class Cat(name: String) : Pet(name)

class Dog(name: String) : Pet(name)

class Fish(name: String) : Pet(name)

/*
Если обобщенный тип является контрвариантным, это означает, что
вы можете использовать супертип вместо подтипа.
Контрвариантность противоположна ковариантности.
*/
class Contest<T : Pet>(var vet: Vet<in T>) { // контрвариантный тип

    val scores: MutableMap<T, Int> = mutableMapOf()
    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores.put(t, score)
    }

    fun getWinners(): MutableSet<T> {
        val highScore = scores.values.max()
        val winners: MutableSet<T> = mutableSetOf()
        for ((t, score) in scores) {
            if (score == highScore) winners.add(t)
        }
        return winners
    }

}
interface Retailer<out T> {
    fun sell(): T
}

class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Продать Кота")
        return Cat("")
    }
}

class DogRetailer : Retailer<Dog> {
    override fun sell(): Dog {
        println("Продать Собаку")
        return Dog("")
    }
}

class FishRetailer : Retailer<Fish>{
    override fun sell(): Fish {
        println("Продать Рыбу")
        return Fish("")
    }
}

class Vet<T: Pet>{
    /* функция получает аргумент типа класса */
    fun treat(t: T){
        println("Угостить питомца ${t.name}")
    }
}

fun main() {
    /* Создание двух обьектов Cat и обьекта Fish */
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGray")

    /* Создаем несколько обьектов Vet */
    val catVet = Vet<Cat>()
    val fishVat = Vet<Fish>()
    val petVet = Vet<Pet>()

    /* Обьекты Vet работают со своими разновидностями Pet */
    catVet.treat(catFuzz)
    petVet.treat(catKatsu)
    petVet.treat(fishFinny)


    /* Vet<Cat> связывается с Contest<Cat>*/
    val catContest = Contest<Cat>(catVet)
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatsu, 56)
    val topCat = catContest.getWinners().first()
    println("Победительница конкурса кошек ${topCat.name}")

    /* Vet<Pet> связывается с Contest<Pet> */
    val petContest = Contest<Pet>(petVet)
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    println("Победитель конкурса домашних животных ${topPet.name}")

    /* Vet<Pet> связывается с Contest<Fish> */
    val fishContest = Contest<Fish>(petVet)

    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()



}

