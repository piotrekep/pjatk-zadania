public class Graniastoslup extends Trojkat{
    private int wysokosc;

    Graniastoslup(int bok, int wysokosc){
        super(bok);
        this.wysokosc=wysokosc;
    }
    Graniastoslup(Trojkat trojkat,int wysokosc){
        super(trojkat.bok());
        this.wysokosc=wysokosc;
    }
    

    public void show(){
       
        System.out.println("pole powierzchni graniastosłupa: " +   ((3 * (super.bok()*wysokosc)) 
                                                    + 2*(super.bok()*super.bok()*1.732/4)) ); 
        
        System.out.println("Objętość graniastosłupa: " + (super.bok()*super.bok()*1.732/4) *wysokosc);
    }
}
