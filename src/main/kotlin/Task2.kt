fun main() {
    val likes = 121
    val getManString: String = if (likes % 10 == 1 && likes % 100 != 11 && likes != 11 || likes == 1) "человеку" else "людям"
    println("Понравилось $likes $getManString")
}