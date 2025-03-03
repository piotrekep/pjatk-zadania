public class s32593 {
    public  void method(){
        Osoba tomek= new Osoba("tomek");
        Spawacz krzysiek = new Spawacz("krzysiek", 10);
        System.out.println(tomek.wyswietl());
        System.out.println(krzysiek.wyswietl());
    }
}

class Osoba {
    private String imie;
 
    Osoba(String imie){
     this.imie=imie;
    }
 
    String wyswietl(){
     return imie;
    }
 }
 
 class Spawacz extends Osoba {
    private int stazPracy;

    Spawacz(String imie, int stazPracy){
        super(imie);
        this.stazPracy=stazPracy;
    }


    String wyswietl(){
        return super.wyswietl() + " " + String.valueOf(stazPracy);
       }
}
