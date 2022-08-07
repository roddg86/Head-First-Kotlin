class Hippo : Animal() {
    override val image = "hippo.jpg"
    override val food = "трава"
    override val habitat = "вода"

    override fun makeNoise(){
        println("Ворчание! Ворчание!")
    }

    override fun eat() {
        println("Бегемот ест $food")
    }
}