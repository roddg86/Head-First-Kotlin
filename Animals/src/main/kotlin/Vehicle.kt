/* Класс реализует интерфейс
* у интерфейса нет конструктора */
class Vehicle: Roamable {
    override fun roam() {
        println("The Vehicle is roaming")
    }
}