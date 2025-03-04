
# Ciąg Collatza – Hailstone Sequence

## Cel zadania

Zadanie polega na implementacji klasy `Hailstone`, która:
- Reprezentuje ciąg Collatza (znany też jako „hailstone sequence” lub ciąg Ulama),
- Rozpoczyna się od liczby startowej (większej od 1),
- Generuje kolejne elementy ciągu według reguły:
  - Jeśli bieżąca liczba jest parzysta, to kolejny element to \( \frac{a}{2} \),
  - Jeśli bieżąca liczba jest nieparzysta, to kolejny element to \( 3 \times a + 1 \),
- Iteracja kończy się, gdy ciąg osiągnie wartość 1.

Dodatkowo, obiekt klasy `Hailstone` musi być iterowalny (implementować interfejs `Iterable<Integer>`), a implementacja nie może korzystać z żadnych tablic ani kolekcji.

## Zasada działania rozwiązania

### 1. Klasa `Hailstone`

- **Prywatne pole `val`:**  
  Przechowuje bieżącą wartość ciągu. Konstruktor inicjalizuje to pole wartością startową.

- **Konstruktor:**  
  Przyjmuje wartość startową (a0) i przypisuje ją do pola `val`.

### 2. Implementacja interfejsu `Iterable`

- **Metoda `iterator()`:**  
  Klasa `Hailstone` implementuje interfejs `Iterable<Integer>` poprzez nadpisanie metody `iterator()`. Metoda ta zwraca anonimową klasę implementującą `Iterator<Integer>`.

- **Metoda `hasNext()`:**  
  Sprawdza, czy bieżąca wartość ciągu (przechowywana w `val`) jest różna od 1. Jeśli tak, oznacza to, że ciąg jeszcze nie zakończył się i można wygenerować kolejny element. Gdy `val` wynosi 1, iteracja powinna zostać zakończona.

- **Metoda `next()`:**  
  Oblicza kolejny element ciągu Collatza według następującej logiki:
  - Jeśli bieżąca liczba jest parzysta, dzieli ją przez 2,
  - Jeśli bieżąca liczba jest nieparzysta, mnoży ją przez 3 i dodaje 1.
  
  Wynik aktualizuje w polu `val` (oraz lokalnie w zmiennej `current`) i zwraca tę nową wartość. Dzięki temu kolejne wywołania iteratora generują kolejne elementy ciągu, aż do osiągnięcia wartości 1.

### 3. Testowanie (klasa `Main`)

- **Inicjalizacja:**  
  W klasie `Main` tworzony jest obiekt `Hailstone` z określoną wartością startową (np. `77031`).

- **Iteracja:**  
  Program iteruje po ciągu Collatza przy użyciu pętli `for-each`. W trakcie iteracji:
  - Zliczana jest liczba kroków do osiągnięcia liczby 1 (inicjowana zmienna `count` ustawiona na `-1` umożliwia prawidłowe liczenie kroków, ponieważ pierwszy element nie jest uznawany za krok zmiany),
  - Wyznaczany jest największy element ciągu (`maxel`).

- **Prezentacja wyników:**  
  Po zakończeniu iteracji na konsoli wypisywane są trzy liczby:
  - Wartość startowa,
  - Liczba kroków wykonanych do osiągnięcia 1,
  - Największy wyraz ciągu.

Dla przykładu, dla liczby `77031` oczekiwany wynik to:
```
77031 350 21933016
```

## Kluczowe aspekty rozwiązania

- **Bez użycia dodatkowych struktur:**  
  Implementacja nie korzysta z tablic ani kolekcji. Każdy kolejny element ciągu jest obliczany „w locie” w metodzie `next()` bez przechowywania wcześniejszych wyników.

- **Iterowalność:**  
  Klasa `Hailstone` implementuje `Iterable<Integer>`, co pozwala na wykorzystanie pętli `for-each` do iteracji po ciągu. Polimorficzne wywołanie metod interfejsu `Iterator` sprawia, że kod jest przejrzysty i zgodny z założeniami zadania.

- **Koniec iteracji:**  
  Iteracja kończy się, gdy bieżąca wartość ciągu wynosi 1. Dzięki temu, pętla w klasie `Main` dokładnie określa liczbę kroków oraz maksymalny element ciągu.

## Podsumowanie

Rozwiązanie zadania polega na dynamicznym generowaniu ciągu Collatza bez użycia dodatkowych struktur danych. Klasa `Hailstone`:
- Inicjuje ciąg od wartości startowej,
- Generuje kolejne elementy zgodnie z regułą Collatza,
- Umożliwia iterację aż do osiągnięcia liczby 1.

Testowany w klasie `Main`, program zlicza kroki oraz identyfikuje największy element ciągu, wypisując wyniki zgodnie z wymaganiami zadania. Takie podejście gwarantuje prostotę, efektywność oraz zgodność z założeniami (brak użycia kolekcji), co czyni rozwiązanie czytelnym i łatwym do dalszej modyfikacji lub analizy.

