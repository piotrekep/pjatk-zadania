public class CiagnikSiodlowy extends PojazdKolowy {
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
