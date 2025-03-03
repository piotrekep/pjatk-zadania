## Zad 7-3

- zmienne przechowujące wynik porównań
- lecimy po słowach, zerujemy wszystkie wyniki
- dla każdego słowa w tym samym czasie
    - reukrencyjnie sumujemy litery
    - sprawdzamy czy ma i
    - sprawdzamy czy są dwa takie same znaki
        - w tym samym czasie sprawdzamy czy znak nie ma swojego odpowiednika przesuniętego o 0x20 czyli wielkiej lub małej litery
- jeśli słowo spełnia któryś z warunków, inkrementujemy zmienną kwalifikator
- po przetestowaniu słowa sprawdzamy czy kwalifikator większy równy 3, jeśli tak to printujemy słowo
