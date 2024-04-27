class ChargerAdapter : Charger{
   private val ip=iphone()
    override fun power(str:String){
        ip.display(str)
    }
}
