package pl.pja.sladan;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Osoba jan = new Osoba("Jan", "Nowak", 1990, 180.5);

        Osoba ewa = new Osoba("Ewa", "Kowalska", 1995, 183.2);


        //jan.przedstawSie();

        System.out.println(jan);
        System.out.println(ewa);

        Osoba.zmienRok(2030);

        System.out.println(jan);
        System.out.println(ewa);

        System.out.println(Kolor.BIALY);
        Kolor.BIALY.czySkladowa();

        System.out.println(Kolor.CZERWONY);
        Kolor.CZERWONY.czySkladowa();

        Kolor k = Kolor.BLEKITNY;
        k.czySkladowa();
    }

}
