/*
Чтобы класс мог использоваться в качестве супер-класса,
он должен быть объявлен открытым (open). Все аспекты класса, которые вы хотите
переопределить, тоже должны быть открытыми.
*/

open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise(){
        println("Животное шумит")
    }

    open fun eat(){
        println("Животное ест")
    }

    open fun roam(){
        println("Животоное бродит")
    }

    fun sleep(){
        println("Животное спит")
    }
}