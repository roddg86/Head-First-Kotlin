abstract class Pet(var name: String)

class Cat(name: String) : Pet(name)

class Dog(name: String) : Pet(name)

class Fish(name: String) : Pet(name)

class Contest<T : Pet> {

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

/* out и ковариантность обобщенного типа */
/* Если обобщенный тип является ковариантным,
это означает, что вы можете использовать подтип
вместо супертипа. */
/* В нашем примере Retailer<Cat> (подтип)
должен присваиваться Retailer<Pet> (супертип), поэтому обобщенный тип T снабжается в интерфейсе Retailer префиксом out: */
interface Retailer<out T> { // ковариантный - это значит что подтип может использоватся вместо супертипа
    fun sell(): T
}

/* Класс реализует интерфейс Retailer для работы с Cat

теперь функция sell() возвращает Cat
*/
class CatRetailer : Retailer<Cat> {
    override fun sell(): Cat {
        println("Продать Кота")
        return Cat("")
    }
}

/* Класс реализует интерфейс Retailer для работы с Dog */
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

/* укажем что обобщенный тип T является разновидностью Pet, для безопастности типов */
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

    /* Создание обькта Конкурс, предназначенного только для Cat */
    val catContest = Contest<Cat>()
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatsu, 56)
    val topCat = catContest.getWinners().first()
    println("Победительница конкурса кошек ${topCat.name}")

    /* Создание обькта Конкурс, предназначенного только для Pet */
    val petContest = Contest<Pet>()
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinners().first()
    println("Победитель конкурса домашних животных ${topPet.name}")

    /* out и ковариантность обобщенного типа */
    /* Создание обьектов Продавец */
    /* переменная типа Retailer с совместимым параметром типа */
    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()



}

