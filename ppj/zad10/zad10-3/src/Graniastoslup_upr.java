public class Graniastoslup_upr extends Trojkat{
    private int wysokosc;
    private static final double pierwiastekZtrzech = 1.732;

    Graniastoslup_upr(int bok, int wysokosc){
        super(bok);
        this.wysokosc=wysokosc;
    }
    Graniastoslup_upr(Trojkat trojkat,int wysokosc){
        super(trojkat.bok());
        this.wysokosc=wysokosc;
    }

    private double poleTrojkata(int bok){

        return bok*bok*pierwiastekZtrzech/4;
    }

    private int poleProstokata(int bokA, int bokB)
    {
        return bokA*bokB;
    }

    private double poleGraniastoslupa(int bok, int wysokosc){
        return (3 * poleProstokata(bok,wysokosc)) + 2*poleTrojkata(bok); 
    }

    private double objetoscGraniastoslupa(int bok, int wysokosc){
        return (bok*bok*pierwiastekZtrzech/4) *wysokosc;
    }

    public void show(){
       
        System.out.println("pole powierzchni graniastosłupa: " +  poleGraniastoslupa(super.bok(),wysokosc) ); 
        
        System.out.println("Objętość graniastosłupa: " + objetoscGraniastoslupa(super.bok(),wysokosc));
    }
}
