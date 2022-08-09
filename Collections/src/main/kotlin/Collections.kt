fun main(){
    val mList = mutableListOf("Футбол", "Бейсбол", "Баскетбол")
    /*mList.sort()
    println(mList) // [Баскетбол, Бейсбол, Футбол]*/

    /*val mMap = mutableMapOf("0" to "Netball")
    var x = 0
    for (item in mList) {
        mMap.put(x.toString(), item)
    }
    println(mMap.values) // [Баскетбол]*/

    /*mList.addAll(mList)
    mList.reverse()
    val set = mList.toSet()
    println(set) // [Баскетбол, Бейсбол, Футбол]*/

    mList.sort()
    mList.reverse()
    println(mList) // [Футбол, Бейсбол, Баскетбол]
}