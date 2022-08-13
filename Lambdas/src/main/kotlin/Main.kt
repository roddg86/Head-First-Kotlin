fun myFun5(
    x: (Int) -> Int = {
        println(it)
        it + 7
    }
) {
    x(4)
}


fun main() {

}
