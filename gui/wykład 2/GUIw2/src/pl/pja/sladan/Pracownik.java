package pl.pja.sladan;

public class Pracownik extends Osoba{

    public Pracownik(String imie, String nazwisko){
        super(imie, nazwisko);
    }

    public void przywitajSie(){
        System.out.println("Dzien dobry");
    }

    public void przywitajSie(String imie){
        System.out.println("Dzien dobry " + imie);
    }

    public void przywitajSie(int i){
        if(i == 0)
            System.out.println("Cześć");
        else if(i == 1)
            System.out.println("Witaj");
        else
            przywitajSie();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null || this.getClass() != obj.getClass())
            return false;

        Pracownik tmp = (Pracownik)obj;
        boolean isEquals = true;

        if(tmp.imie != null && this.imie != null)
            isEquals = isEquals && tmp.imie.equals(this.imie);
        else
            if(!(tmp.imie == null && this.imie == null))
                isEquals = false;

        if(tmp.nazwisko != null && this.nazwisko != null)
            isEquals = isEquals && tmp.nazwisko.equals(this.nazwisko);
        else
            if(!(tmp.nazwisko == null && this.nazwisko == null))
                isEquals = false;


        return isEquals;

    }

    @Override
    public String toString() {
        return "Pracownik " + super.toString();
    }
}
