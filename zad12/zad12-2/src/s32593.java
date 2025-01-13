public class s32593 {
    public void method(){
        CiagnikSiodlowy ciagnik = new CiagnikSiodlowy(3, 32999);
        ciagnik.color="czarny";
        ciagnik.rozpocznijJazde();
    }
}

class Pojazd {
    String color;
}

class PojazdKolowy extends Pojazd{
    private int iloscOsi;
    PojazdKolowy(int iloscOsi){
        this.iloscOsi=iloscOsi;
    }

    int osie(){
        return iloscOsi;
    }
}

class CiagnikSiodlowy extends PojazdKolowy {
    public int masa;

    CiagnikSiodlowy(int iloscOsi, int masa){
        super(iloscOsi);
        this.masa=masa;
    }
    
   public void rozpocznijJazde(){
        double nacisk =masa/super.osie();
        if(nacisk<11000) System.out.println("nacisk: " + nacisk + "kg na oś");
        else System.out.println("Jazda niebezpieczna. Odmowa uruchomienia silnika");

    }

}