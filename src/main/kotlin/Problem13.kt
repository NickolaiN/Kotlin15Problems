fun main() {
    var number = readln().toInt()
    engineStatus(number)
}

fun engineStatus(engineNumber: Int): String {
    return try{
        rawEngineStatus(engineNumber)
    } catch (e: EngineNotFoundException) {
        "engine $engineNumber not found"
    } catch (e: SensorMeltException) {
        "engine $engineNumber offline"
    }
}

fun rawEngineStatus(engineNumber: Int) : String {
    return engineNumber.toString()
}
