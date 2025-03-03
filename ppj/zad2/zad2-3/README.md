## Zadanie 2 - 3

Definiujemy zmienna: int input=435642234;

Ostatnie 5 bitów:
- obliczamy o ile miejsć trzeba wykonać przesunięcie: 32-5. gdzie 32 to rozmiar inta, a 5 to ilość ostatnich bitów
- przesuwamy w prawo o obliczone przesunięcie 

Zwracamy 7 bit:
- tworzymy jednobitową maskę o wartości: 1 
- przesuwamy maskę o 7 miejsc w lewo
- operacja maska & input zeruje wszystkie bity za wyjątkiem siódmego
- przesuwamy wynik o 7 w prawo

Zwracamy poszczególne bajty
- bajt zerowy: maska = 255, i jak w przykładzie wyżej maska & input
- bajt pierwszy: input przesunięty w prawo o 8 miejsc i & 255
- j/w tylko shift o 16 miejsc
- dalej 24 miejsca

Zwraca dwa środkowe bajty jako jedną liczbe
- maskujemy dwa środkowe batjy 0x00ffff00
- shiftujemy 8 w prawo