class Vampire : Monster() {
    override fun frighten(): Boolean {
        println("Попробуй перекусить?")
        return false
    }
}