Oto plik `README.md`, który wyjaśnia Twoje rozwiązanie zadania i może być zrozumiały dla Twoich kolegów:

```markdown
# Zadanie: Klasa Rakieta

## Opis zadania
Stworzyliśmy klasę `Rakieta`, która zawiera następujące pola i metody:

- **Pola:**
  - `String nazwa` – nazwa rakiety.
  - `int wagaPaliwa` – waga paliwa w rakiecie.

- **Metody:**
  1. `zatankuj()` – metoda, która losowo przydziela ilość paliwa do rakiety (od 0 do 2000 jednostek).
  2. `start()` – metoda rozpoczynająca procedurę startową. Sprawdza, czy rakieta ma wystarczającą ilość paliwa (przynajmniej 1000 jednostek). Jeśli paliwa jest za mało, generowany jest wyjątek z komunikatem: `Start anulowany - za mało paliwa!`.

## Struktura projektu
Projekt zawiera następujące pliki:
1. **App.java** – klasa uruchomieniowa zawierająca metodę `main`, w której tworzona jest instancja klasy i uruchamiane są metody klasy `Rakieta`.
2. **s32593.java** – plik zawierający implementację klasy `Rakieta`, jej metod oraz obsługę wyjątków.

## Jak to działa?
1. W klasie `App`, w metodzie `main`, tworzona jest instancja klasy `s32593`.
2. Klasa `s32593` wywołuje metodę `method`, która:
   - Tworzy obiekt klasy `Rakieta` z nazwą `"rakieta 1"`.
   - Wywołuje metodę `zatankuj`, która losuje ilość paliwa w zakresie 0–2000.
   - Próbuje uruchomić rakietę metodą `start`.
   - Jeśli rakieta ma mniej niż 1000 jednostek paliwa, metoda `start` rzuca wyjątek `MojWyjatek` z odpowiednim komunikatem. Wyjątek jest obsługiwany w bloku `try-catch`.

## Przykładowe wyniki działania
- Jeśli rakieta ma **wystarczającą ilość paliwa** (≥1000), metoda `start` wykonuje się poprawnie.
- Jeśli rakieta ma **za mało paliwa** (<1000), zostaje wyświetlony komunikat:  
  `Start anulowany - za mało paliwa!`.

## Jak uruchomić projekt?
1. Skompiluj oba pliki (`App.java` i `s32593.java`) za pomocą komendy:
   ```bash
   javac App.java s32593.java
   ```
2. Uruchom plik `App.java`:
   ```bash
   java App
   ```

## Uwagi
- Użyliśmy klasy `Math.random` do generowania losowej ilości paliwa.
- Wyjątek `MojWyjatek` dziedziczy po klasie `Exception`, co pozwala na użycie go w mechanizmie `try-catch`.

## Autor
s32593
```
