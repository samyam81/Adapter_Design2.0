public class Charging {
    private charger ch;

    public charger getCh() {
        return ch;
    }

    public void setCh(charger ch) {
        this.ch = ch;
    }

    public void charge(String str){
        ch.power(str);
    }

}
