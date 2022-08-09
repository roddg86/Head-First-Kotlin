fun main(args: Array<String>) {
    /* Создание двух обьектов Cat и обьекта Fish */
    val catFuzz = Cat("Fuzz Lightyear")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny McGraw")

    /* Создание обьекта Contest, предназначенного только для Cat */
    val catContest = Contest<Cat>()
    catContest.addScore(catFuzz, 50)
    catContest.addScore(catKatsu, 45)
    val topCat = catContest.getWinnes().first()
    println("Победительница конкурса кошек ${topCat.name}")

    /* Создание обьекта Contest для Pet; такой обьект будет принимать любые подклассы Pet */
    val petContest = Contest<Pet>()
    petContest.addScore(catFuzz, 50)
    petContest.addScore(fishFinny, 56)
    val topPet = petContest.getWinnes().first()
    println("Победитель конкурса домашних животных ${topPet.name}")
}