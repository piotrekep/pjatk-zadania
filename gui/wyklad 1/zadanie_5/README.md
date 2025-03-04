# Cocktail Sort

## Cel zadania

Zadanie polega na:
- Utworzeniu 100-elementowej tablicy liczb całkowitych, przy czym każda wartość pochodzi z zakresu 10-100.
- Wyświetleniu zawartości tablicy przed sortowaniem.
- Zaimplementowaniu algorytmu sortowania koktajlowego (Cocktail Sort) w celu posortowania tablicy.
- Wyświetleniu posortowanej tablicy.

## Zasada działania rozwiązania

### 1. Generowanie tablicy

- **Inicjalizacja:**  
  Program tworzy tablicę o rozmiarze 100.
  
- **Losowe wypełnienie:**  
  Każdy element tablicy jest przypisywany losową wartością z przedziału 10-100. Wykorzystuje się metodę `Math.random()` w połączeniu z odpowiednią transformacją, aby uzyskać liczby całkowite w zadanym zakresie.

### 2. Wyświetlanie tablicy przed sortowaniem

- Przed sortowaniem zawartość tablicy jest wypisywana na konsolę, co umożliwia porównanie nieposortowanych danych z wynikiem końcowym.

### 3. Implementacja sortowania koktajlowego

- **Podstawowy mechanizm:**  
  Sortowanie koktajlowe to odmiana sortowania bąbelkowego, która działa dwukierunkowo – najpierw przesuwa największe elementy na koniec, a następnie najmniejsze na początek tablicy.

- **Wskaźniki graniczne:**  
  Używane są dwa wskaźniki:
  - `startIdx` – wskazuje początek nieposortowanego fragmentu tablicy.
  - `endIdx` – wskazuje koniec nieposortowanego fragmentu tablicy.
  
- **Iteracja w obu kierunkach:**  
  - **Przejście od lewej do prawej:**  
    Iteracja zaczyna się od indeksu `startIdx`. Dla każdej pary sąsiadujących elementów porównywane są ich wartości. Jeśli element po lewej jest większy od elementu po prawej, następuje zamiana. Po dotarciu do końca nieposortowanego fragmentu (`endIdx`) kierunek iteracji zostaje zmieniony, a wskaźnik `endIdx` jest zmniejszany.
    
  - **Przejście od prawej do lewej:**  
    Po zmianie kierunku iteracji, elementy są porównywane od końca do początku. W tej fazie, jeśli element po prawej jest mniejszy od sąsiadującego z lewej, następuje zamiana. Po osiągnięciu początku nieposortowanego fragmentu (`startIdx`) kierunek ponownie się zmienia, a wskaźnik `startIdx` jest zwiększany.
  
- **Zakończenie iteracji:**  
  Proces sortowania kontynuuje się aż do momentu, gdy `startIdx` zrówna się z `endIdx`, co oznacza, że cała tablica została posortowana.

### 4. Wyświetlanie tablicy po sortowaniu

- Po zakończeniu sortowania, posortowana tablica jest wypisywana na konsolę. Dzięki temu można zobaczyć efekt działania algorytmu, porównując wynik z wcześniejszym, nieposortowanym stanem tablicy.

## Podsumowanie

- **Losowe dane:**  
  Tablica jest wypełniana losowymi liczbami z zakresu 10-100, co umożliwia testowanie algorytmu na różnych danych.

- **Sortowanie koktajlowe:**  
  Dzięki iteracji w obu kierunkach, algorytm efektywnie przemieszcza zarówno największe, jak i najmniejsze elementy do właściwych pozycji, zmniejszając zakres nieposortowanego fragmentu z każdą iteracją.

- **Prezentacja wyników:**  
  Program wypisuje zawartość tablicy przed i po sortowaniu, co umożliwia łatwą weryfikację poprawności działania algorytmu.

Implementacja rozwiązania stanowi praktyczny przykład zastosowania sortowania koktajlowego i spełnia wymagania zadania, prezentując zarówno generowanie danych, jak i ich sortowanie oraz prezentację wyników.
