public class Prostopadloscian_upr extends Prostokat{
    private int wysokosc;


    Prostopadloscian_upr(int bokA, int bokB, int wysokosc){
        super(bokA, bokB);
        this.wysokosc=wysokosc;
    }
    Prostopadloscian_upr(Prostokat prostokat,int wysokosc){
        super(prostokat.bokA(),prostokat.bokB());
        this.wysokosc=wysokosc;
    }

    private int policzPoleBoku(int bokA, int bokB)
    {
        return bokA*bokB;
    }

    private int policzPoleCalkowite(int polePodstawy, int poleBokuA, int poleBokuB)
    {   
        int polePowierzchni;
       
        polePowierzchni=2 * polePodstawy + 2* poleBokuA + 2 * poleBokuB;

        return polePowierzchni;
    

    }

    private int policzObjetosc(int bokA, int bokB, int wysokosc){
        
        return bokA*bokB*wysokosc;

    }

    public void show(){

        int polePodstawy = policzPoleBoku(super.bokA(), super.bokB());
        int poleBokuA = policzPoleBoku(super.bokA(), wysokosc);
        int poleBokuB = policzPoleBoku(super.bokB(), wysokosc);


        int polePowierzchni = policzPoleCalkowite(polePodstawy,poleBokuA, poleBokuB);

        int objetosc=policzObjetosc(super.bokA(), super.bokB(), wysokosc);
       

        System.out.println("pole powieszchni prostopadłoscianu: " + polePowierzchni);

        System.out.println("Objętość prostopadłoscianu: " + objetosc);
    }
}
