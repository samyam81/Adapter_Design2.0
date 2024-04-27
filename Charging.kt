open class Charging(private val ch: Charger) {
//    var ch:Charger

    fun charge(str:String){
        ch.power(str)
    }
}
