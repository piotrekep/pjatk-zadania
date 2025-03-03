package pl.edu.pja.sladan.oisoos;

import java.io.Serializable;

public class Osoba implements Serializable {

    public String imie;
    public String nazwisko;
    public int wiek;

    public Osoba(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " " + wiek;
    }
}
