# Zadanie: Sprawdzanie tablicy kwadratowej

## Opis zadania
Należało stworzyć program, który:
1. Wypełnia dwuwymiarową tablicę kwadratową losowymi wartościami z przedziału od 0 do 5.
2. Sprawdza, czy dla elementów tablicy \( a_{ij} \), gdzie \( i \neq j \), wartość wynosi 0.
3. Jeśli powyższy warunek nie jest spełniony, rzuca wyjątek wskazujący, które elementy tablicy są błędne.

Przykład tablicy wejściowej:
```java
int[][] tab = {
    { 0, 0, 1 },
    { 0, 1, 0 },
    { 0, 1, 0 }
};
```

Dla powyższej tablicy program wygeneruje wyjątek:
```
Tablica nie spełnia wymagań, błędy na pozycjach [0,2], [2,1]
```

## Struktura projektu

Projekt składa się z dwóch plików:
1. **App.java** – klasa główna uruchamiająca program.
2. **s32593.java** – implementacja logiki sprawdzania tablicy oraz definiowanie własnego wyjątku.

## Jak to działa?

1. **Generowanie tablicy:**
   - W metodzie `method` tworzona jest kwadratowa tablica `tab` o zadanym rozmiarze (w przykładzie: 3x3).
   - Tablica jest wypełniana losowymi wartościami z przedziału 0-5 przy użyciu `Math.random()`.

2. **Sprawdzanie warunku:**
   - Metoda `test` iteruje po wszystkich elementach tablicy.
   - Jeśli indeksy \( i \neq j \), a wartość elementu \( a_{ij} \neq 0 \), zapamiętywana jest pozycja błędu.

3. **Rzucanie wyjątku:**
   - Jeżeli znaleziono błędne wartości, metoda `test` rzuca wyjątek `MojWyjatek`, w którym w komunikacie znajdują się współrzędne błędnych elementów.

4. **Obsługa wyjątku:**
   - W bloku `try-catch` w metodzie `method` przechwytywany jest wyjątek, a jego komunikat wyświetlany na konsoli.

## Przykładowe wyniki działania
- **Dla poprawnej tablicy:**
  ```java
  int[][] tab = {
      { 0, 0, 0 },
      { 0, 1, 0 },
      { 0, 0, 1 }
  };
  ```
  Program działa poprawnie i nie generuje błędu.

- **Dla tablicy z błędami:**
  ```java
  int[][] tab = {
      { 0, 0, 1 },
      { 0, 1, 0 },
      { 0, 1, 0 }
  };
  ```
  Wyrzucany jest wyjątek z komunikatem:
  ```
  Tablica nie spełnia wymagań, błędy na pozycjach [0,2], [2,1]
  ```

## Jak uruchomić projekt?
1. Skompiluj oba pliki:
   ```bash
   javac App.java s32593.java
   ```
2. Uruchom plik `App.java`:
   ```bash
   java App
   ```

## Uwagi
- Kod zakłada, że tablica jest kwadratowa.
- Wyjątek `MojWyjatek` został zaimplementowany jako klasa dziedzicząca po `Exception`, co pozwala na dokładne określenie przyczyny błędu.

## Autor
s32593
```

