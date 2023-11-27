fun main() {
    val importantString = readln()
    val bugMentions = Regex("[BUG]+").findAll(importantString)
        .map(MatchResult::value).toList()
    println(calculateBugMentions(bugMentions))
}

fun calculateBugMentions(bugMentions: List<String>): Int{
    return bugMentions.size
}
