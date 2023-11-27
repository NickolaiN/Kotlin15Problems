fun main() {
    val numString = readln()
    val number = Regex("[0-9]+").findAll(numString)
        .map(MatchResult::value)
        .toList()
    println(calculateEvenDigits(number))
}

fun calculateEvenDigits(number: List<String>): Int{
    var i = 0
    var sum = 0
    while(i < number.size){
        if (number[i].toInt() % 2 == 0)
            sum += number[i].toInt()
        i += 1
    }
    return sum
}
