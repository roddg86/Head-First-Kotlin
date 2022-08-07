class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "мясо"
    override val habitat = "леса"

    override fun makeNoise() {
        println("Уууууууу!")
    }

    override fun eat() {
        println("Волк ест $food")
    }
}