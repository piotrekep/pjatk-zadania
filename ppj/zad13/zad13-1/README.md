# Analiza Znaków w Pliku Tekstowym

Ten program służy do analizy zawartości pliku tekstowego. Zlicza wystąpienia każdego znaku w pliku i wyświetla wyniki w czytelnej formie. Poniżej znajduje się szczegółowy opis, jak działa program oraz jak można go uruchomić.

## Jak działa program?

Program otwiera plik tekstowy o nazwie `dowolny plik tekstowy.txt` (plik musi znajdować się w tym samym katalogu co program). Następnie wykonuje następujące kroki:

1. **Odczyt znaków z pliku:**
   - Za pomocą obiektu `FileInputStream` program odczytuje plik znak po znaku.

2. **Zliczanie wystąpień znaków:**
   - Program przechowuje wystąpienia znaków w tablicy obiektów `wystapieniaZnaku`.
   - Każdy obiekt `wystapieniaZnaku` zawiera dwa pola:
     - `znak` — znak, którego wystąpienia są zliczane.
     - `liczbaWystapien` — liczba wystąpień tego znaku.

3. **Dodawanie lub aktualizacja znaków:**
   - Jeśli znak został już wcześniej znaleziony w tablicy, program zwiększa licznik wystąpień dla tego znaku.
   - Jeśli znak nie został jeszcze znaleziony, jest dodawany do tablicy.

4. **Wyświetlanie wyników:**
   - Po zakończeniu analizy, program wyświetla listę wszystkich znalezionych znaków wraz z liczbą ich wystąpień.

## Struktura programu

### Klasa główna: `s32593`
Ta klasa zawiera główną logikę programu:
- `method()` — główna metoda, która wykonuje całą analizę.
- `sprawdzCzyJestZnak(char znak, wystapieniaZnaku[] tab)` — sprawdza, czy dany znak jest już w tablicy.
- `inkrementujZnak(int index, wystapieniaZnaku[] tab)` — zwiększa licznik wystąpień dla znaku na danym indeksie.
- `dopiszZnak(char znak, wystapieniaZnaku[] tab)` — dodaje nowy znak do tablicy.
- `listujZnaki(wystapieniaZnaku[] tab)` — wyświetla wyniki na konsoli.

### Klasa pomocnicza: `wystapieniaZnaku`
Reprezentuje pojedynczy znak i liczbę jego wystąpień. Zawiera dwa pola:
- `char znak` — znak.
- `int liczbaWystapien` — liczba wystąpień znaku.

## Jak uruchomić program?

1. **Przygotowanie środowiska:**
   - Upewnij się, że masz zainstalowaną Javę (JDK).

2. **Przygotowanie pliku tekstowego:**
   - Utwórz plik tekstowy o nazwie `dowolny plik tekstowy.txt` i umieść go w tym samym katalogu co program.

3. **Uruchomienie programu:**
   - Skompiluj program poleceniem:
     ```bash
     javac s32593.java
     ```
   - Uruchom program poleceniem:
     ```bash
     java s32593
     ```

4. **Odczyt wyników:**
   - Program wypisze w konsoli listę znaków zliczonych w pliku oraz liczbę ich wystąpień.

## Przykład wyjścia programu

Zakładając, że plik `dowolny plik tekstowy.txt` zawiera:
```
Hello\nWorld
```
Program wyświetli na konsoli:
```
Znak: H wystąpił 1 razy
Znak: e wystąpił 1 razy
Znak: l wystąpił 3 razy
Znak: o wystąpił 2 razy
Znak: \n  wystąpił 1 razy
Znak: W wystąpił 1 razy
Znak: r wystąpił 1 razy
Znak: d wystąpił 1 razy
```

## Uwagi
- Program nie odróżnia dużych i małych liter (np. `A` i `a` są traktowane jako różne znaki).
- Plik wejściowy musi znajdować się w katalogu roboczym programu.

## Autor
Kod został napisany jako zadanie na zajęcia, mające na celu zrozumienie pracy z plikami i strukturami danych w Javie.
