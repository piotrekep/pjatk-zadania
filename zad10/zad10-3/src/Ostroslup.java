public class Ostroslup extends Trojkat{
    private int wysokosc;

    Ostroslup(int bok, int wysokosc){
        super(bok);
        this.wysokosc=wysokosc;
    }
    Ostroslup(Trojkat trojkat,int wysokosc){
        super(trojkat.bok());
        this.wysokosc=wysokosc;
    }
    

    public void show(){
       
        System.out.println("pole powierzchni ostrosłupa: " +   (3 * (Math.sqrt((super.bok()*1.732/6)*(super.bok()*1.732/6) + wysokosc*wysokosc) * super.bok()/2) 
                                                    + (super.bok()*super.bok()*1.732/4)) ); 
        
        System.out.println("Objętość ostrosłupa: " + (super.bok()*super.bok()*1.732/4) *wysokosc/3);
    }
}
