class DVDPlayer(var hasRecorder: Boolean) {
    fun playDVD(){
        println("DVD playing")
    }

    fun recordDVD(){
        if(hasRecorder){
            println("DVD recording")
        }
    }
}