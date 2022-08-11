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
        /* получить максимальное значение из score */
        val highScore = scores.values.max()
        val winners: MutableSet<T> = mutableSetOf()
        for ((t, score) in scores){
            /* Включить участников с максимальной оценкой в MutableSet. */
            if (score == highScore) winners.add(t)
        }
        /* Вернуть множество MutableSet с данными победителей. */
        return winners
    }

}