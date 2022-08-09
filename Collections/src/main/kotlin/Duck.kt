class Duck(val size: Int = 17) {
    override fun equals(other: Any?): Boolean{
        if(this === other) return true
        if (other is Duck && size == other.size) return true
        return false
    }

    override fun hashCode(): Int {
        return size
    }
}