fun main(args: Array<String>) {
    val m = arrayOf(
        Vampire(),
        Dragon(),
        Monster()
    )
    for (item in m) {
        item.frighten()
    }

}