# Konwersja Liczby Binarnie Zakodowanej w Pliku na Liczbę Całkowitą

Ten program odczytuje binarnie zakodowaną liczbę z pliku tekstowego, konwertuje ją na liczbę całkowitą, a następnie zapisuje tę liczbę w postaci binarnej do innego pliku. Poniżej znajdziesz szczegółowe informacje na temat jego działania i instrukcję uruchomienia.

## Jak działa program?

Program wykonuje następujące kroki:

1. **Odczyt liczby z pliku wejściowego:**
   - Plik wejściowy o nazwie `plik tekstowy z liczba.txt` zawiera liczbę zakodowaną w systemie binarnym (np. `1101`).
   - Program odczytuje zawartość pliku znak po znaku i konwertuje ciąg znaków binarnych na liczbę całkowitą.

2. **Konwersja liczby:**
   - Odczytana liczba w systemie binarnym jest przesuwana bitowo (`<<`) i przeliczana na system dziesiętny przy użyciu funkcji `Character.getNumericValue()`.

3. **Wyświetlenie liczby:**
   - Po zakończeniu odczytu i konwersji, liczba całkowita jest wyświetlana w konsoli.

4. **Zapis liczby do pliku wyjściowego:**
   - Liczba jest zapisywana do pliku binarnego `liczba.bin` w postaci 4 bajtów (format Big-Endian).

## Struktura programu

### Klasa główna: `s32593`
- `method()` — główna metoda programu. Wykonuje całą logikę:
  1. Otwiera plik wejściowy `plik tekstowy z liczba.txt` i odczytuje zawartość.
  2. Konwertuje odczytaną liczbę binarną na system dziesiętny.
  3. Wyświetla wynik w konsoli.
  4. Zapisuje wynik do pliku binarnego `liczba.bin`.

### Obsługa plików
- Plik wejściowy (`plik tekstowy z liczba.txt`) musi zawierać ciąg binarny, np. `1101`.
- Plik wyjściowy (`liczba.bin`) zostanie utworzony lub nadpisany w katalogu roboczym programu.

## Jak uruchomić program?

1. **Przygotowanie środowiska:**
   - Upewnij się, że masz zainstalowaną Javę (JDK).

2. **Przygotowanie plików:**
   - Stwórz plik tekstowy o nazwie `plik tekstowy z liczba.txt` i umieść w nim ciąg binarny, np. `1101`.

3. **Uruchomienie programu:**
   - Skompiluj program poleceniem:
     ```bash
     javac s32593.java
     ```
   - Uruchom program poleceniem:
     ```bash
     java s32593
     ```

4. **Sprawdzenie wyników:**
   - Program wyświetli przeliczoną liczbę w konsoli.
   - Plik wyjściowy `liczba.bin` będzie zawierał tę liczbę w postaci binarnej.

## Przykład wyjścia programu

Zakładając, że plik `plik tekstowy z liczba.txt` zawiera ciąg:
```
1101
```
Program wyświetli w konsoli:
```
13
```
A w pliku `liczba.bin` zapisze wartość liczby `13` w formacie binarnym (4 bajty w systemie Big-Endian).

## Uwagi
- Plik wejściowy musi zawierać poprawny ciąg binarny (składający się wyłącznie z `0` i `1`).
- Jeśli plik wejściowy nie istnieje lub zawiera niepoprawne dane, program wypisze stosowny komunikat o błędzie.

## Autor
Kod został przygotowany jako zadanie do nauki pracy z plikami i operacji bitowych w Javie.
