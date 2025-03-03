public class s32593 {
    public void method() throws Exception {
        
        Prostokat pr = new Prostokat(6, 6);
        pr.show();

        Trojkat tr = new Trojkat(6);
        tr.show();

        Prostopadloscian prs = new Prostopadloscian(6,6,6 );
        prs.show();

        
        Ostroslup os = new Ostroslup(6,6);
        os.show();


        Graniastoslup gr = new Graniastoslup(6,6);
        gr.show();




    }
}

class Prostokat {
    private int bokA;
    private int bokB;

    Prostokat(int bokA, int bokB){
        this.bokB=bokB;
        this.bokA=bokA;
    }

    public void show(){
        System.out.println("pole powieszchni prostokąta: " +bokA*bokB);
    }

    public int bokA(){
        return bokA;
    }

    public int bokB(){
        return bokB;
    }

}



class Trojkat {
    private int bok;

    Trojkat(int bok){
        this.bok=bok;
    }

    public void show(){
        System.out.println("pole powieszchni trojkata: " +bok*bok*1.732/4);
    }

    public int bok(){
        return bok;
    }



}


class Prostopadloscian extends Prostokat{
    private int wysokosc;


    Prostopadloscian(int bokA, int bokB, int wysokosc){
        super(bokA, bokB);
        this.wysokosc=wysokosc;
    }
    Prostopadloscian(Prostokat prostokat,int wysokosc){
        super(prostokat.bokA(),prostokat.bokB());
        this.wysokosc=wysokosc;
    }

    public void show(){
        System.out.println("pole powieszchni prostopadłoscianu: " + 
                    (2*(super.bokA()*super.bokB())
                    + 2*(super.bokA()*this.wysokosc) 
                    + 2*(super.bokB()*this.wysokosc)));

        System.out.println("Objętość prostopadłoscianu: " + super.bokA()*super.bokB()*wysokosc);
    }
}

class Ostroslup extends Trojkat{
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


class Graniastoslup extends Trojkat{
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
