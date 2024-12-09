# Zadanie: 10-1

---

## Opis projektu
Ten projekt demonstruje implementację klasy `Kwadrat` w języku Java, która umożliwia obliczanie:
- **Pola powierzchni kwadratu** (bok * bok),
- **Objętości sześcianu** zbudowanego na podstawie tego kwadratu (bok * bok * bok).

Kod zawiera dwie klasy:
1. **`Kwadrat`**: Definiuje konstrukcję i logikę operacji związanych z kwadratem.
2. **`s32593`**: Plik główny, który demonstruje użycie klasy `Kwadrat`.

---

## Zawartość plików

1. **Kwadrat.java** - Klasa `Kwadrat` definiująca:
   - Pole `bok`, które przechowuje długość boku kwadratu.
   - Konstruktor inicjalizujący pole `bok` na podstawie podanego argumentu.
   - Metodę `show()`, która wyświetla pole powierzchni kwadratu oraz objętość sześcianu.

   Kod klasy `Kwadrat`:
  ``` public class Kwadrat {
       private int bok;

       // Konstruktor klasy, który przyjmuje długość boku kwadratu jako parametr
       Kwadrat(int bok){
           this.bok = bok;
       }

       // Metoda show() oblicza i wyświetla pole powierzchni oraz objętość
       public void show(){
           // Wyświetlenie pola powierzchni kwadratu
           System.out.println("Pole powieszchni kwadratu: " + bok * bok);

           // Wyświetlenie objętości sześcianu zbudowanego na podstawie tego kwadratu
           System.out.println("Objętość sześcianu: " + bok * bok * bok);
       }
   }
```
2. **s32593.java** - Plik główny programu, który:
   - Tworzy obiekt klasy `Kwadrat` o zadanej długości boku (w przykładzie `666`).
   - Wywołuje metodę `show()` obiektu `Kwadrat`, aby wyświetlić wyniki obliczeń.

   Kod pliku głównego:
```   public class s32593 {
       public static void main(String[] args) throws Exception {
           // Tworzenie obiektu klasy Kwadrat o boku długości 666
           Kwadrat kwadrat = new Kwadrat(666);

           // Wywołanie metody show() w celu wyświetlenia wyników
           kwadrat.show();
       }
   }
```
---

## Wyjaśnienie kodu

### Klasa `Kwadrat`
1. **Pole `bok`**: Przechowuje długość boku kwadratu (prywatne, dostępne tylko wewnątrz klasy).
2. **Konstruktor**: Przyjmuje długość boku jako parametr i inicjalizuje pole `bok`.
3. **Metoda `show()`**:
   - Oblicza pole powierzchni kwadratu jako `bok * bok`.
   - Oblicza objętość sześcianu jako `bok * bok * bok`.
   - Wyświetla obliczone wartości w konsoli.

### Plik główny (`s32593`)
1. Tworzy obiekt klasy `Kwadrat` z długością boku ustawioną na `666`.
2. Wywołuje metodę `show()` obiektu `Kwadrat`, aby zaprezentować wyniki obliczeń w konsoli.

---

## Przykładowy wynik działania programu

Dla długości boku kwadratu wynoszącej `666`, program wyświetli:
```
Pole powieszchni kwadratu: 443556  
Objętość sześcianu: 295408296
```