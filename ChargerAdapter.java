public class ChargerAdapter implements charger{
    iphone ip=new iphone();
    
    @Override
    public void power(String str){
        ip.display(str);
    }
}
