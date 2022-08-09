fun main(){
    val term1 = "Array"
    val term2 = "List"
    val term3 = "Map"
    val term4 = "MutableList"
    val term5 = "MutableMap"
    val term6 = "MutableSet"
    val term7 = "Set"

    val def1 = "Хранит значения в произвольном порядке."
    val def2 = "Содержит пары ключ/значение."
    val def3 = "Содержит значения в последовательности."
    val def4 = "Можно обновить."
    val def5 = "Невозможно обновить."
    val def6 = "Можно изменить размер."
    val def7 = "Невозможно изменить размер."

    val glossary = mapOf ( term4 to "$def3 $def4 $def6",
    term7 to "$def1 $def5 $def7",
    term1 to "$def3 $def4 $def7",
    term5 to "$def2 $def4 $def6",
    term2 to "$def3 $def5 $def7",
    term6 to "$def1 $def4 $def6",
    term3 to "$def2 $def5 $def7")
    for ((key, value) in glossary) println("$key: $value")

}