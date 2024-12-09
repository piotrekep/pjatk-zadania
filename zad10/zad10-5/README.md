# Projekt: Zadanie 10-5

---

## Opis projektu
Ten projekt implementuje hierarchię klas Java:
1. Klasa bazowa **`Pojazd`**: Przechowuje informację o kolorze pojazdu.
2. Klasa **`PojazdKolowy`**: Dziedziczy z `Pojazd` i przechowuje liczbę osi.
3. Klasa **`CiagnikSiodlowy`**: Dziedziczy z `PojazdKolowy` i dodaje pole `masa` oraz metodę `rozpocznijJazde()`, która sprawdza nacisk pojazdu na jedną oś.

---

## Zawartość plików

### Pojazd.java
Klasa `Pojazd` reprezentuje pojazd.

Kod:
```public class Pojazd {
    String color; // Kolor pojazdu
}
```
---

### PojazdKolowy.java
Klasa `PojazdKolowy` dziedziczy z `Pojazd` i dodaje informację o liczbie osi.

Kod:
```public class PojazdKolowy extends Pojazd {
    private int iloscOsi;

    // Konstruktor przyjmujący liczbę osi
    PojazdKolowy(int iloscOsi){
        this.iloscOsi = iloscOsi;
    }

    // Getter zwracający liczbę osi
    int osie(){
        return iloscOsi;
    }
}
```
---

### CiagnikSiodlowy.java
Klasa `CiagnikSiodlowy` dziedziczy z `PojazdKolowy` i dodaje masę pojazdu oraz metodę do oceny bezpieczeństwa jazdy.

Kod:
```public class CiagnikSiodlowy extends PojazdKolowy {
    public int masa;

    // Konstruktor przyjmujący liczbę osi i masę pojazdu
    CiagnikSiodlowy(int iloscOsi, int masa){
        super(iloscOsi);
        this.masa = masa;
    }

    // Metoda sprawdzająca nacisk na jedną oś i bezpieczeństwo jazdy
    public void rozpocznijJazde(){
        double nacisk = masa / super.osie();
        if(nacisk < 11000) {
            System.out.println("nacisk: " + nacisk + "kg na oś");
        } else {
            System.out.println("Jazda niebezpieczna. Odmowa uruchomienia silnika");
        }
    }
}
```
---

### s32593.java
Plik główny programu, który testuje klasy `Pojazd`, `PojazdKolowy` oraz `CiagnikSiodlowy`.

Kod:
```public class s32593 {
    public static void main(String[] args) throws Exception {
        // Tworzenie obiektu klasy CiagnikSiodlowy
        CiagnikSiodlowy ciagnik = new CiagnikSiodlowy(3, 32999);

        // Ustawienie koloru ciągnika
        ciagnik.color = "czarny";

        // Sprawdzenie bezpieczeństwa jazdy
        ciagnik.rozpocznijJazde();
    }
}
```
---

## Wyjaśnienie kodu

### Klasa `Pojazd`
1. Pole `color`: Przechowuje kolor pojazdu (publiczne).

### Klasa `PojazdKolowy`
1. Pole `iloscOsi`: Przechowuje liczbę osi pojazdu (prywatne).
2. Konstruktor: Przyjmuje liczbę osi i inicjalizuje pole `iloscOsi`.
3. Metoda `osie()`: Zwraca liczbę osi.

### Klasa `CiagnikSiodlowy`
1. Pole `masa`: Przechowuje masę ciągnika siodłowego.
2. Konstruktor: Przyjmuje liczbę osi i masę, inicjalizuje je za pomocą klasy bazowej oraz własnego pola.
3. Metoda `rozpocznijJazde()`: Oblicza nacisk na jedną oś i wyświetla:
   - Nacisk w przypadku, gdy jest on bezpieczny (poniżej 11 000 kg).
   - Komunikat ostrzegawczy, jeśli nacisk przekracza 11 000 kg.

### Plik główny (`s32593`)
1. Tworzy obiekt klasy `CiagnikSiodlowy` z trzema osiami i masą `32 999 kg`.
2. Ustawia kolor ciągnika na "czarny".
3. Wywołuje metodę `rozpocznijJazde()`, aby sprawdzić bezpieczeństwo jazdy.

---

## Przykładowy wynik działania programu
```
nacisk: 10999.666666666666kg na oś
```
