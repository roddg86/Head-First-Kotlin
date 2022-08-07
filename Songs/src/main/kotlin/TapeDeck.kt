class TapeDeck {
    var hasRecorder = false

    fun playTape(){
        println("Воспроизведение ленты")
    }

    fun recordTape(){
        if (hasRecorder){
            println("Запись на ленту")
        }
    }
}