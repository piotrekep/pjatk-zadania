
# Kolekcje Liczb

## Cel zadania

Zadanie polega na:
- Wczytaniu z pliku `tab.txt` liczb całkowitych, które są oddzielone dowolnymi białymi znakami.
- Wyznaczeniu maksymalnej wartości wśród wczytanych liczb.
- Znalezieniu wszystkich indeksów, pod którymi ta maksymalna wartość występuje.
- Wypisaniu na konsoli:
  - Wszystkich wczytanych liczb.
  - Maksymalnej wartości.
  - Indeksów, gdzie występuje maksymalna wartość.

## Zasada działania rozwiązania

### 1. Wczytywanie danych z pliku

- **Strumień bajtowy:**  
  Program otwiera plik `tab.txt` za pomocą `FileInputStream`, który odczytuje dane bajt po bajcie.

- **Buforowanie znaków:**  
  Podczas odczytu, każdy bajt jest analizowany:
  - Jeśli bajt reprezentuje cyfrę (od `'0'` do `'9'`) lub znak minus (`'-'`), zostaje dodany do tymczasowego bufora znaków (`buf`).  
  - W momencie, gdy napotkany zostanie inny znak (np. biały znak, znak nowej linii), sprawdzany jest bufor:
    - Jeśli bufor nie jest pusty, jego zawartość (reprezentująca liczbę) jest konwertowana na typ `Integer` i dodawana do kolekcji `numbers`.
    - Bufor jest następnie resetowany do pustego ciągu.

- **Efekt:**  
  W efekcie w kolekcji `numbers` znajdują się wszystkie liczby całkowite z pliku.

### 2. Znajdowanie maksymalnej wartości

- **Użycie biblioteki:**  
  Po wczytaniu liczb program korzysta z metody `Collections.max()`, która przeszukuje całą kolekcję i zwraca największą wartość.

### 3. Wyszukiwanie indeksów maksymalnej wartości

- **Iteracja po kolekcji:**  
  Program przechodzi przez całą listę liczb przy pomocy pętli `for`.
- **Porównanie:**  
  Dla każdego elementu sprawdzane jest, czy jego wartość jest równa znalezionej maksymalnej wartości.
- **Wypisywanie indeksów:**  
  Jeśli warunek jest spełniony, indeks elementu jest wypisywany na konsolę.

### 4. Wypisywanie wyników

Program wypisuje na konsoli:
- **Pierwszy wiersz:** Całą kolekcję liczb (przykładowo, w formie listy).
- **Drugi wiersz:** Maksymalną wartość.
- **Trzeci wiersz:** Indeksy, pod którymi w kolekcji występuje ta maksymalna wartość.

## Podsumowanie

Rozwiązanie działa według następującej logiki:
1. **Odczyt pliku:** Strumieniowo odczytywany jest plik `tab.txt` znak po znaku, przy czym liczby są rozdzielane przez dowolne białe znaki.
2. **Buforowanie i konwersja:** Zgromadzone znaki są buforowane do momentu napotkania separatora, po czym bufor zostaje przekonwertowany na liczbę całkowitą i dodany do kolekcji.
3. **Wyszukiwanie maksimum:** Po zbudowaniu kolekcji znajduje się maksymalna wartość przy pomocy `Collections.max()`.
4. **Indeksowanie:** Następuje iteracja po kolekcji, aby wyłonić indeksy, pod którymi maksymalna wartość występuje.
5. **Prezentacja:** Wyniki są wypisywane na konsoli w trzech liniach, zgodnie z wymaganiami zadania.

To podejście pozwala na efektywne wczytywanie danych z pliku oraz przeprowadzanie operacji na kolekcji liczb bez korzystania z dodatkowych struktur, przy jednoczesnym zapewnieniu czytelności i prostoty kodu.
