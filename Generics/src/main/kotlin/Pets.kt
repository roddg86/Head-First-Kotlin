/* Класс Pet помечается как абстрактный, потому что в приложении должны
создаваться объекты только подклассов Pet */
abstract class Pet(var name: String)

/* свойство name, наследуеться конкретными подклассами. */
class Cat(name: String) : Pet(name)

class Dog(name: String) : Pet(name)

class Fish(name: String) : Pet(name)

/* Класс Contest будет использоваться для управления оценками на выставке
и определения победителя. */

/* <T> после имени класса сообщает компилятору, что Т обобщенным типом */

/* если вы пишете класс коллекции или интерфейс, используйте обозначение «E» (сокращение от «Element»),
а для ключей и значений массивов — «K» или «V» (сокращения от «Key» и «Value»). */
class Contest<T>{
    //...
}