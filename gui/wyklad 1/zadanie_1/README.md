
# Zadanie 1 wykład 1

## Opis Zadania

Celem zadania było stworzenie programu, który symuluje podstawowe operacje na kontach bankowych. Główne operacje, jakie można wykonać na koncie, to:
- **Wpłata środków** – metoda `deposit()`
- **Wypłata środków** – metoda `withdraw()`
- **Przelew środków** – metoda `transfer(...)`
- **Naliczanie odsetek** – metoda `addInterest()`

Dodatkowo, stopa oprocentowania jest wspólna dla wszystkich kont (pole statyczne) i ustawiana przy pomocy metody `setInterestRate(...)`.

## Struktura Projektu

Projekt składa się z czterech głównych klas:

- **Person.java**  
  Reprezentuje osobę (klienta banku). Klasa zawiera tylko jedno pole – imię klienta.

- **Account.java**  
  Główna klasa operacji bankowych. Przechowuje stan konta (balance) i implementuje metody:
  - `deposit(double deposit)` – zwiększa stan konta o podaną kwotę.
  - `withdraw(double withdraw)` – zmniejsza stan konta o podaną kwotę.
  - `transfer(Account toAccount, double ammount)` – wykonuje przelew, najpierw odejmując środki z jednego konta, a potem dodając do drugiego.
  - `addInterest()` – nalicza odsetki na podstawie statycznej stopy oprocentowania.
  - `setInterestRate(double interestRate)` – ustawia wspólną dla wszystkich kont stopę procentową.

- **BankCustomer.java**  
  Łączy obiekt klasy `Person` z kontem bankowym (`Account`). Każdy klient banku posiada swoje konto, a klasa ta udostępnia metodę `getAccount()` oraz `toString()` do wyświetlania informacji o kliencie i stanie jego konta.

- **BankingTest.java**  
  Klasa testowa zawierająca metodę `main`, w której:
  1. Tworzę obiekty `Person` dla przykładowych klientów.
  2. Na ich podstawie tworzę obiekty `BankCustomer`.
  3. Wykonuję operacje:
     - Wpłata środków na konta.
     - Przelew środków między kontami.
     - Wypłata środków.
  4. Wyświetlam stan kont klientów.
  5. Ustawiam stopę oprocentowania i naliczam odsetki na kontach.
  6. Ponownie wyświetlam stan kont, by pokazać efekt dodania odsetek.

## Zasada Działania

1. **Inicjalizacja Klientów i Kont:**  
   W klasie `BankingTest` tworzone są obiekty `Person` (np. Jan i Ala), które są następnie wykorzystywane do utworzenia obiektów `BankCustomer`. Konstruktor klasy `BankCustomer` automatycznie tworzy nowe konto (`Account`) dla każdego klienta.

2. **Operacje na Koncie:**  
   - **Wpłata:**  
     Metoda `deposit()` zwiększa stan konta o podaną kwotę.  
     Przykład: `jan.getAccount().deposit(1000);` powoduje, że konto Jana wzrasta do 1000 jednostek.
     
   - **Przelew:**  
     Metoda `transfer()` najpierw wykonuje wypłatę z jednego konta, a następnie wpłatę na konto odbiorcy.  
     Przykład: `jan.getAccount().transfer(ala.getAccount(), 500);` powoduje, że z konta Jana zostaje pobrane 500 jednostek, a konto Ali zostaje powiększone o tę kwotę.
     
   - **Wypłata:**  
     Metoda `withdraw()` odejmuje podaną kwotę od stanu konta.  
     Przykład: `ala.getAccount().withdraw(1000);` zmniejsza stan konta Ali.
     
   - **Naliczanie Odsetek:**  
     Po ustawieniu stopy oprocentowania (np. `Account.setInterestRate(4.5);`), metoda `addInterest()` aktualizuje stan konta zgodnie z wzorem:  
     ```
     balance = balance * (1 + (InterestRate / 100))
     ```
     Dzięki temu na koncie dodawane są odsetki w skali rocznej.

3. **Prezentacja Wyników:**  
   Metoda `toString()` w klasie `BankCustomer` zwraca czytelną informację o kliencie i jego stanie konta, co pozwala łatwo sprawdzić wynik operacji na konsoli.

## Przykładowe Działanie

Po wykonaniu operacji opisanych w `BankingTest.java`, oczekiwany wynik wyświetlony na konsoli to:

```
Klient: Jan stan konta 500.0
Klient: Ala stan konta 1500.0
Klient: Jan stan konta 522.5
Klient: Ala stan konta 1567.5
```

## Podsumowanie

Rozwiązanie zostało zaimplementowane w sposób prosty i przejrzysty. Klasy zostały podzielone według odpowiedzialności, co ułatwia zrozumienie logiki operacji bankowych. Każdy klient posiada swoje konto, na którym wykonywane są operacje wpłat, wypłat, przelewów oraz naliczania odsetek przy użyciu wspólnej stopy oprocentowania. To podejście umożliwia łatwą modyfikację oraz rozwijanie projektu, co jest szczególnie przydatne w środowisku edukacyjnym.

