public class phone {
    public static void main(String[] args) {
        charger ch=new ChargerAdapter();
        Charging charging=new Charging();
        charging.setCh(ch);
        charging.charge("58 Charging");
    }
}
