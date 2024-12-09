# Projekt: Zadanie 10-4

---

## Opis projektu
Ten projekt implementuje hierarchię klas Java:
- Klasa bazowa **`Osoba`**: Zawiera pole `imie` oraz metodę `wyswietl()` zwracającą imię.
- Klasa pochodna **`Spawacz`**: Dziedziczy z klasy `Osoba` i rozszerza ją o pole `stazPracy`. Metoda `wyswietl()` w tej klasie wykorzystuje `super` do wyświetlenia informacji z klasy bazowej oraz dodaje staż pracy.

---

## Zawartość plików

### Osoba.java
Klasa `Osoba` reprezentuje osobę.

Kod:
```public class Osoba {
   private String imie;

   // Konstruktor inicjalizujący imię osoby
   Osoba(String imie){
       this.imie = imie;
   }

   // Metoda zwracająca imię osoby
   String wyswietl(){
       return imie;
   }
}
```
---

### Spawacz.java
Klasa `Spawacz` dziedziczy z `Osoba` i dodaje informacje o stażu pracy.

Kod:
```public class Spawacz extends Osoba {
    private int stazPracy;

    // Konstruktor inicjalizujący imię oraz staż pracy
    Spawacz(String imie, int stazPracy){
        super(imie);
        this.stazPracy = stazPracy;
    }

    // Metoda zwracająca imię i staż pracy
    String wyswietl(){
        return super.wyswietl() + " " + String.valueOf(stazPracy);
    }
}
```
---

### s32593.java
Plik główny programu, który testuje klasy `Osoba` i `Spawacz`.

Kod:
```public class s32593 {
    public static void main(String[] args) throws Exception {
        // Tworzenie obiektów klas Osoba i Spawacz
        Osoba tomek = new Osoba("tomek");
        Spawacz krzysiek = new Spawacz("krzysiek", 10);

        // Wyświetlanie informacji
        System.out.println(tomek.wyswietl());       // Wyświetla imię: "tomek"
        System.out.println(krzysiek.wyswietl());   // Wyświetla imię i staż: "krzysiek 10"
    }
}
```
---

## Wyjaśnienie kodu

### Klasa `Osoba`
1. Pole `imie`: Przechowuje imię osoby (prywatne).
2. Konstruktor: Przyjmuje jako parametr imię i inicjalizuje pole `imie`.
3. Metoda `wyswietl()`: Zwraca wartość pola `imie`.

### Klasa `Spawacz`
1. Pole `stazPracy`: Przechowuje informację o stażu pracy spawacza.
2. Konstruktor: Przyjmuje jako parametry `imie` i `stazPracy`. Inicjalizuje `imie` za pomocą `super` i ustawia wartość `stazPracy`.
3. Metoda `wyswietl()`: Korzysta z `super.wyswietl()` do uzyskania imienia z klasy bazowej oraz dodaje staż pracy.

### Plik główny (`s32593`)
1. Tworzy obiekt klasy `Osoba` z imieniem "tomek".
2. Tworzy obiekt klasy `Spawacz` z imieniem "krzysiek" i stażem pracy `10`.
3. Wyświetla informacje o obiektach przy użyciu metody `wyswietl()`.

---

## Przykładowy wynik działania programu
```
tomek  
krzysiek 10
```