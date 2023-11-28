import java.lang.NullPointerException

fun main() {
    val str = null
    println(getLenght(str))
}

fun getLenght(str: String?): Int {
    return try {
        str!!.length
    } catch (e: NullPointerException) {
        0
    }
}
