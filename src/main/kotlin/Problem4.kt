fun main() {
    try {
        val dayNumber = readln().toInt()
        val bugRank = readln().toInt() + 42
        val cash = readln().toInt()
        println(courseOfSug(dayNumber, bugRank, cash))
    } catch (e: NumberFormatException) {
        println("Неверный формат данных")
    }
}

fun courseOfSug(x: Int, y: Int, z: Int): Int{
    return x * y * z
}
