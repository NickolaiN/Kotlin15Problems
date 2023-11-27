fun main(){
    println(readln().toInt().getYearEra())
}

fun Int.getYearEra() : String
{
    return when {
        this < 1970 -> "до"
        this == 1970 -> "соответствует"
        this in 1970..2000 -> "после (XX век)"
        this in 2000..2023 -> "после (XXI век)"
        else -> "далекое будущее"
    }
}
