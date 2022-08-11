abstract class Pet(var name: String)

class Cat(name: String) : Pet(name)

class Dog(name: String) : Pet(name)

class Fish(name: String) : Pet(name)

/* Установим ограничение для Т, тип Т должен быть разновидностью суперкласса Pet */
/* T - обобщенный тип, который должен быть Pet или один из его подклассов */
class Contest<T: Pet>{
    /* Свойство scores используется для хранения информации о том, какую
    оценку получил тот или иной участник. */
    val scores: MutableMap<T, Int> = mutableMapOf()
}