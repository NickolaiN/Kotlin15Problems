fun main() {
    try {
        val entityCount = readln().toInt()
        val number = entityCount / 2
        println(calcChairs(entityCount, number))
    } catch (e: NumberFormatException) {
        println("Введено неверное число")
    }

}

fun calcChairs(x: Int, z: Int): Int{
    return x + z
}
