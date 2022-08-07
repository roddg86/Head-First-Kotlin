/* Rectangle 0 has area 15. It is not a square.
Rectangle 1 has area 36. It is a square.
Rectangle 2 has area 63. It is not a square.
Rectangle 3 has area 96. It is not a square. */
class Rectangle(var width: Int, var height: Int) {
    val isSquare: Boolean
        get() = (width == height)

    val area: Int
        get() = (width * height)
}