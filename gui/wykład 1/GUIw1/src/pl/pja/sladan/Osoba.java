package pl.pja.sladan;

public class Osoba {

    public String imie;
    public String nazwisko;
    private int rokUrodzenia;
    private double wysokosc;
    private static int aktualnyRok = 2019;

    public Osoba(String imie, String nazwisko, int rokUrodzenia, double wysokosc){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
        this.wysokosc = wysokosc;
    }


    public static void zmienRok(int aktualnyRok){
        if(aktualnyRok>0)
            Osoba.aktualnyRok = aktualnyRok;
    }

//    public void przedstawSie(){
//        System.out.println("Imię: " + imie + "\nNazwisko:" + nazwisko +
//                "\nWiek: " + (2019-rokUrodzenia) + "\nWysokosc: " + wysokosc);
//    }

    @Override
    public String toString() {
        return "Imię: " + imie + "\nNazwisko:" + nazwisko +
                "\nWiek: " + (aktualnyRok-rokUrodzenia) + "\nWysokosc: " + wysokosc;
    }
}
