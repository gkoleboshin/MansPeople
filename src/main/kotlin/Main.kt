fun main(args: Array<String>) {
    val likes = 121
    val mansPeople = if (likes%10!=1||likes%100==11){"людям"}else{"человеку"}
    println("Понравилось $likes $mansPeople")
}