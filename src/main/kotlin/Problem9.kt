class NibirunianClass {
    var name: String = " "
    public var namePlate: String = " "
    fun createNamePlate(){
        name = readln()
        namePlate = "Живи долго и счастливо, $name"
        println(namePlate)
    }
}
