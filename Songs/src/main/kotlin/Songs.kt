/* Определяем свойства title и artist */
class Song (val title: String, val artist: String) {
    fun play(){
        println("Воспроизведение песни $title в исполнении $artist")
    }

    fun stop(){
        println("Прекращено воспроизведение $title")
    }
}