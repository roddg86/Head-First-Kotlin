class MyDucks(var myDucks: Array<Duck?>) {
    fun quack(){
        for (duck in myDucks){
            duck?.let{
                it.quack()
            }
        }
    }

    fun totalDuckHeight():Int{
        var h: Int = 0
            for (duck in myDucks){
                h += duck?.heigth ?: 0
            }
        return h
    }
}