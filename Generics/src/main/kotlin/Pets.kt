abstract class Pet(var name: String)

class Cat(name: String) : Pet(name)

class Dog(name: String) : Pet(name)

class Fish(name: String) : Pet(name)

class Contest<T: Pet>{

    val scores: MutableMap<T, Int> = mutableMapOf()

    /* Добавить участника и его оценку в MutableMap при условии, что оценка
    больше либо равна 0.

    Участник и оценка передаются функции в параметрах;
    */
    fun addScore(t: T, score: Int = 0){
        /* если оценка равна 0 или выше, функция добавляет данные в MutableMap как пару «ключ-значение». */
        if(score >= 0) scores.put(t, score)
    }


}