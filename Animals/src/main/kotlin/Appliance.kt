abstract class Appliance {
    var pluggedIn = true
    abstract val color: String
    abstract fun consumePower()
}