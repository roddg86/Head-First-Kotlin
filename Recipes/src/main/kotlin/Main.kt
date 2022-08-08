fun main(args: Array<String>) {
    var m1 = Movie("Blaack Panther", "2018")
    var m2 = Movie("Jurassic World", "2015")
    var m3 = Movie("Jurassic World", "2015")

    var s1 = Song("Love Cats", "The Cure")
    var s2 = Song("Wild Horses", "The Rolling Stones")
    var s3 = Song("Love Cats", "The Cure")

    println(m2 == m3) // true
    println(s1 == s3) // false

    var m4 = m1.copy()
    println(m1 == m4) // true

    var m5 = m1.copy()
    println(m1 === m5) // false

    var m6 = m2
    m2 = m3
    println(m3 == m6) // true
}