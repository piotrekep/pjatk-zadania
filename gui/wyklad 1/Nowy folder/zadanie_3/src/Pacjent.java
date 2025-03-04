public class Pacjent {
    private String nazwisko;
    private String choroba;
    private String leczenie;

    Pacjent(String nazwisko){
        this.nazwisko = nazwisko;
    }

    String nazwisko(){
        return this.nazwisko;
    }

    void ustawChorobe(String choroba)
    {
        this.choroba=choroba;

    }

    void ustawLeczenie(String leczenie)
    {
        this.leczenie=leczenie;
    }

    String choroba(){
        return choroba;
    }

    String leczenie(){
        return leczenie;
    }
}
