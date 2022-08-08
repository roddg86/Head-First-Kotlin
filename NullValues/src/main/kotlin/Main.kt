fun main(args: Array<String>) {
    val test: String = "Yes"

    try {
        println("Start try")
        riskyCode(test)
        println("End try")
    } catch (e: BadException) {
        println("Bad Exception")
    } finally {
        println("Finally")
    }
    println("End of main")
}

/*
        NO                      YES

    Start try               Start try
    Start risky code        Start risky code
    End risky               Bad Exception
    End try                 Finally
    Finally                 End of main
    End of main

*/

class BadException : Exception()

fun riskyCode(test: String) {
    println("Start risky code")
    if (test == "Yes") {
        throw BadException()
    }
    println("End risky")
}

