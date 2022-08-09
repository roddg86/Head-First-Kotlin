fun main(){

    /*
    [Zero, Two, Four, Six]
    [Two, Four, Six, Eight]
    [Two, Four, Six, Eight, Ten]
    [Two, Four, Six, Eight, Ten]
    */
    var a: MutableList<String> = mutableListOf()
    a.add(0, "Zero")
    a.add(1, "Two")
    a.add(2, "Four")
    a.add(3,"Six")
    println(a)
    if (a.contains("Zero")) a.add("Eight")
    a.removeAt(0)
    println(a)
    if (a.indexOf("Four") != 4) a.add("Ten")
    println(a)
    if (a.contains("Zero")) a.add("Twelve")
    println(a)





}