package pl.pja.sladan;

public abstract class Pojazd {

    String nazwa;

    public void showNazwa(){
        System.out.println(nazwa);
    }

    public abstract void showTypPojazdu();

}
