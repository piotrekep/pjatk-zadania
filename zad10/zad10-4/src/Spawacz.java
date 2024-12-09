public class Spawacz extends Osoba {
    private int stazPracy;

    Spawacz(String imie, int stazPracy){
        super(imie);
        this.stazPracy=stazPracy;
    }


    String wyswietl(){
        return super.wyswietl() + " " + String.valueOf(stazPracy);
       }
}
