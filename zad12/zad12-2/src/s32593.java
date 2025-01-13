public class s32593 {
    public void method(){
        CiagnikSiodlowy ciagnik = new CiagnikSiodlowy(3, 32999);
        ciagnik.color="czarny";
        try {
            ciagnik.rozpocznijJazde();
        } catch (Exception e) {
            System.out.println(e);
        }
        
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
    
   public void rozpocznijJazde() throws Exception{
        double nacisk =masa/super.osie();
        if(nacisk<11000) System.out.println("nacisk: " + nacisk + "kg na oś");
        else throw new MojWyjatek("Jazda niebezpieczna. Odmowa uruchomienia silnika");

    }

}

class MojWyjatek extends Exception {
    public MojWyjatek(String message) {
        super(message);
    }
}