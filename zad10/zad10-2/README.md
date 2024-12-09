# Projekt: Zadanie 10-2

---

## Opis projektu
Ten projekt demonstruje implementację klasy `Walec` w języku Java, która umożliwia obliczanie:
- **Pola powierzchni podstawy walca** (π * promień²),
- **Objętości walca** (π * promień² * wysokość).

Kod zawiera dwie klasy:
1. **`Walec`**: Definiuje konstrukcję i logikę operacji związanych z walcem.
2. **`s32593`**: Plik główny, który demonstruje użycie klasy `Walec`.

---

## Zawartość plików

1. **Walec.java** - Klasa `Walec` definiująca:
   - Pola `promien` i `wysokosc`, które przechowują odpowiednio promień podstawy walca oraz jego wysokość.
   - Konstruktor inicjalizujący pola `promien` i `wysokosc` na podstawie podanych argumentów.
   - Metodę `show()`, która wyświetla pole powierzchni podstawy walca oraz jego objętość.

   Kod klasy `Walec`:
  ``` public class Walec {
       private int wysokosc;
       private int promien;

       // Konstruktor klasy, który inicjalizuje wartości promienia i wysokości
       Walec(int wysokosc, int promien){
           this.wysokosc = wysokosc;
           this.promien = promien;
       }

       // Metoda show() oblicza i wyświetla pole podstawy oraz objętość walca
       public void show(){
           // Obliczenie pola podstawy walca (π * promień²)
           double pole = promien * promien * 3.1416d;
           System.out.println("pole podstawy: " + pole);

           // Obliczenie objętości walca (π * promień² * wysokość)
           System.out.println("Objętość walca: " + pole * wysokosc);
       }
   }
```
2. **s32593.java** - Plik główny programu, który:
   - Tworzy obiekt klasy `Walec` o zadanych parametrach promienia i wysokości (w przykładzie `66` i `6`).
   - Wywołuje metodę `show()` obiektu `Walec`, aby wyświetlić wyniki obliczeń.

   Kod pliku głównego:
  ``` public class s32593 {
       public static void main(String[] args) throws Exception {
           // Tworzenie obiektu klasy Walec o promieniu 66 i wysokości 6
           Walec walec = new Walec(66, 6);

           // Wywołanie metody show() w celu wyświetlenia wyników
           walec.show();
       }
   }
```
---

## Wyjaśnienie kodu

### Klasa `Walec`
1. **Pola `wysokosc` i `promien`**:
   - `wysokosc`: Przechowuje wysokość walca.
   - `promien`: Przechowuje promień podstawy walca.
   Oba pola są prywatne, co oznacza, że są dostępne tylko wewnątrz klasy.
2. **Konstruktor**:
   - Przyjmuje wysokość i promień jako parametry i inicjalizuje odpowiednie pola.
3. **Metoda `show()`**:
   - Oblicza pole podstawy walca jako `π * promień²`.
   - Oblicza objętość walca jako `π * promień² * wysokość`.
   - Wyświetla obliczone wartości w konsoli.

### Plik główny (`s32593`)
1. Tworzy obiekt klasy `Walec` z promieniem ustawionym na `66` i wysokością na `6`.
2. Wywołuje metodę `show()` obiektu `Walec`, aby zaprezentować wyniki obliczeń w konsoli.

---

## Przykładowy wynik działania programu

Dla promienia walca wynoszącego `66` i wysokości `6`, program wyświetli:
```
pole podstawy: 13683.8496  
Objętość walca: 82093.0976
```