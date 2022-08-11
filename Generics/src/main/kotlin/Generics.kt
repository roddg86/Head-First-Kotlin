class Generics {
    /* Определим переменную для хранения ссылки на список с элеметами строк
    * тип элемента в <> значит что это обобщение
    *  */
    /* означает, что «E» превращается в «String» в любой функции или
    объявлении переменной, в которых используется «E» */

    val x: MutableList<String> = TODO()
}

/*

    Он интерпретируется компилятором в виде

interface MutableList<String> : List<String>, MutableCollection<String> {
    fun add(index: Int, element: String): Unit
}

*/

/*

    «E» — условное обозначение РЕАЛЬНОГО типа, который будет использоваться при объявлении MutableList.
    MutableList наследуется от интерфейсов List и MutableCollection.
    Тип, указанный вами для MutableList (значение «E»), автоматически используется в качестве типа List и MutableCollection.

interface MutableList<E> : List<E>, MutableCollection<E>

    Какой бы тип ни скрывался за «E», он определяет, какие объекты можно добавлять в MutableList.

fun add(index: Int, element: E): Unit

 */