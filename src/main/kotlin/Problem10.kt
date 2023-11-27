class SugarStorage (volume:Int = 10) {
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
