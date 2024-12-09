public class Ostroslup_upr extends Trojkat{
    private int wysokosc;
    private static final double pierwiastekZtrzech = 1.732;

    Ostroslup_upr(int bok, int wysokosc){
        super(bok);
        this.wysokosc=wysokosc;
    }
    Ostroslup_upr(Trojkat trojkat,int wysokosc){
        super(trojkat.bok());
        this.wysokosc=wysokosc;
    }
    
    //wysokość sciany liczy się z promienia okregu wpisanego w podstawe, i wysokości
    // pierwiastek z sumy kwadratów promienia i wysokości ostrosłupa
    private double wysSciany(int bok, int wysokosc){

        return Math.sqrt(Math.pow(bok*pierwiastekZtrzech/6,2) + Math.pow(wysokosc, 2)); //wzór na wysokość sciany
    }

    private double poleTrojkata(int bok, double wysokosc)
    {
        return bok*wysokosc/2;
    }

    private double poleTrojkata(int bok){

        return bok*bok*pierwiastekZtrzech/4;
    }

    private double poleOstrslupa(int bok, int wysokosc){

        return 3 * poleTrojkata(bok, wysSciany(bok, wysokosc)) + poleTrojkata(bok);

    }

    private double objetoscOstrosłupa(int bok, int wysoksoc){

        return (bok*bok*pierwiastekZtrzech/4) * wysokosc/3;
    }

    public void show(){


       
        System.out.println("pole powierzchni ostrosłupa: " +  poleOstrslupa(super.bok(),wysokosc) ); 
        
        System.out.println("Objętość ostrosłupa: " + objetoscOstrosłupa(super.bok(),wysokosc));
    }
}
