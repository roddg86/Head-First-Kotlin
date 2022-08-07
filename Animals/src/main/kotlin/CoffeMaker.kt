class CoffeMaker : Appliance() {
    override val color = ""
    var coffeeLeft = false

    override fun consumePower() {
        println("Consuming power")
    }

    fun fillWithWater(){
        println("Fill with water")
    }

    fun makeCoffe(){
        println("Make the coffe")
    }
}