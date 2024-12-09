public class Prostopadloscian extends Prostokat{
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
