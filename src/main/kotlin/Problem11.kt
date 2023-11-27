class SugarStorage2 (volume:Int = 10) {
    var volume : Int = 10
    fun decreaseSugar(v:Int) {
        if (v > 0) {
            volume -= v
        }
        if (volume < 0) {
            volume = 0
        }
    }
    fun increaseSugar(v:Int) {
        if (v > 0) {
            volume += v
        }
    }
}

open class Bug(val rank: Int, val name: String) {
    open fun getSugarLimit(): Int{
        return rank
    }

    fun getId(): String{
        return "${rank}.${name}"
    }
}
