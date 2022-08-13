abstract class Pet(var name: String)

class Cat(name: String) : Pet(name)

class Dog(name: String) : Pet(name)

class Fish(name: String) : Pet(name)

class Contest<T: Pet>(){
    var scores: MutableMap<T, Int> = mutableMapOf()

    fun addScore(t: T, score: Int = 0){
        if(score >= 0) scores.put(t, score)
    }

    fun getWinners(): Set<T>{
        /* Оценки хранятся в виде значений Int в MutableMap с именем score, поэтому это выражение получает
        значение наивысшей оценки */
        val highScore = scores.values.max()

        /* Содержимое scores фильтруется, чтобы в нем остались только элементы со значением highScore.
        Затем свойство keys результата используется для получения победителей. */
        val winners = scores.filter {it.value == highScore}.keys

        /* Функция forEach используется для вывода имен(name) всех победителей. */
        winners.forEach{ println("Winner: ${it.name}") }
        return winners
    }
}