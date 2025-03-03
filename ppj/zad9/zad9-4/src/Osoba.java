public class Osoba {
    public String imie;
    public String nazwisko;
    public int rokUrodzenia;

    Osoba(String imie, String nazwisko, int rokUrodzenia)
    {
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rokUrodzenia;
    }

    public void show()
    {
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println(rokUrodzenia);
    }

}
