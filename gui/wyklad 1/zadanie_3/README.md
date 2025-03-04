
# Pacjenci

## Cel zadania

Celem zadania było stworzenie hierarchii klas reprezentujących pacjentów, z których każdy ma przypisaną chorobę oraz stosowaną metodę leczenia. Program powinien wykorzystywać polimorficzne wywoływanie metod, aby przy iteracji po tablicy pacjentów wyświetlać odpowiednie informacje dla każdego z nich. Oczekiwany wynik to:

```
Pacjent: Janek
Chory na: głowa
Zastosowano: aspiryna

Pacjent: Edzio
Chory na: noga
Zastosowano: gips

Pacjent: Marian
Chory na: dyspepsja
Zastosowano: węgiel
```

## Zasada działania rozwiązania

### 1. Klasa bazowa - `Pacjent`

- **Przechowywanie danych:**  
  Klasa `Pacjent` przechowuje trzy podstawowe informacje:
  - Nazwisko (lub imię) pacjenta,
  - Chorobę,
  - Stosowane leczenie.
  
- **Metody ustawiające i pobierające:**  
  Metody `ustawChorobe(String choroba)` oraz `ustawLeczenie(String leczenie)` służą do przypisania odpowiednich wartości. Metody `choroba()`, `leczenie()` oraz `nazwisko()` zwracają te wartości.

- **Polimorficzne wywołanie:**  
  W naszym programie obiekty różnych typów pacjentów (klasy dziedziczące po `Pacjent`) przechowywane są w tablicy typu `Pacjent`. Dzięki temu, wywołanie metod `choroba()` i `leczenie()` na referencjach typu `Pacjent` odbywa się polimorficznie – każdy obiekt "sam decyduje", jakie dane zwrócić, ponieważ ich wartości zostały ustawione przez odpowiednie podklasy.

### 2. Klasy dziedziczące

Dla każdego rodzaju pacjenta stworzono osobną klasę dziedziczącą po `Pacjent`:
  
- **`ChoryNaGlowe`**  
  Konstruktor tej klasy wywołuje konstruktor klasy bazowej, a następnie ustawia:
  - Chorobę: `"głowa"`,
  - Leczenie: `"aspiryna"`.

- **`ChoryNaNoge`**  
  Podobnie, konstruktor ustawia:
  - Chorobę: `"noga"`,
  - Leczenie: `"gips"`.

- **`ChoryNaDyspepsje`**  
  Konstruktor tej klasy ustawia:
  - Chorobę: `"dyspepsja"` (choć w kodzie pojawia się inna wartość – należy zadbać, aby wynik odpowiadał wymaganiom),
  - Leczenie: `"węgiel"`.

W każdej z tych klas odpowiednie informacje są przypisywane przez wywołanie metod zdefiniowanych w klasie `Pacjent`. Dzięki temu, mimo że wszystkie obiekty są traktowane jako `Pacjent`, każdy z nich „pamięta” o swojej specyficznej chorobie i metodzie leczenia.

### 3. Klasa testowa - `Test`

- **Inicjalizacja:**  
  W metodzie `main()` tworzona jest tablica obiektów typu `Pacjent`, w której umieszczone są instancje klas: `ChoryNaGlowe`, `ChoryNaNoge` oraz `ChoryNaDyspepsje`.

- **Iteracja i wywołanie polimorficzne:**  
  Program iteruje po tablicy pacjentów przy użyciu pętli `for-each`. Dla każdego obiektu wywoływane są metody `nazwisko()`, `choroba()` i `leczenie()`. Polimorfizm gwarantuje, że mimo iż zmienna referencyjna ma typ `Pacjent`, wywoływane są metody, których wyniki odpowiadają danym ustawionym w konstruktorach poszczególnych podklas.

- **Wypisywanie wyników:**  
  Wynik jest drukowany w formacie wymaganym przez zadanie, gdzie dla każdego pacjenta wyświetlane są:
  - Imię,
  - Rodzaj choroby,
  - Zastosowane leczenie.

## Podsumowanie

Rozwiązanie opiera się na:
- **Dziedziczeniu:** Wszystkie specjalizacje pacjentów dziedziczą po wspólnej klasie `Pacjent`, która definiuje podstawowe metody i pola.
- **Polimorfizmie:** Metody `choroba()` i `leczenie()` są wywoływane na referencjach typu `Pacjent`, a konkretne wartości zwracane zależą od tego, która klasa (podklasa) została zainicjowana.
- **Prostocie implementacji:** Każda klasa dziedzicząca w swoim konstruktorze ustawia odpowiednie informacje, co pozwala na łatwe rozszerzenie systemu o kolejne typy pacjentów w przyszłości.

Dzięki takiemu podejściu kod jest przejrzysty, a logika przypisywania choroby i leczenia dla poszczególnych pacjentów jest jednoznaczna i łatwa do zrozumienia dla kolegów ze studiów.
ozumieć zasadę działania rozwiązania zadania "Pacjenci" i podkreślić wykorzystanie polimorfizmu przy wywoływaniu metod specyficznych dla poszczególnych typów pacjentów.