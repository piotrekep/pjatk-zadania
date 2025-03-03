## Zad9-5

Kalkulator liczb zespolonych
- definiujemy klasę która opisuje nam liczbę zespoloną.
    - klasa przechowuje pola w których zapisane są wartosci liczby zespolonej. oddzielnie rzeczywista i urojona
- metody wykonujące operacje na tych liczbach
    - inc() inkrementuje część rzeczywistą o 1;
    - add() gdzie argument jest dodawany do pól klasy. część rzeczywista do rzeczywistej, urojona do urojonej
    - sub() to samo tylko odejmowanie
    - mul() mnożenie według wzoru - tu był potrzebny buforek dla obliczonej wartości części rzeczywistej wyniku, żeby nie modyfikować oryginalnej która jest potrzebna do obliczenia części urojonej
    - no i show() printuje liczbe