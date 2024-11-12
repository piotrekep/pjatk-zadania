## Zad6-8

Krok 1:
- robimy tablice
- robimy tablice w której będzie lustro

Krok 2:
- wypełniamy tablicę znakami. z tabelki utf8 odczytujemy, że litery A do Z to wartości 65 do 90
- wiemy, że random() generuje liczbę od 0 do 1, więc mnożymy razy 26 liter alfabetu, co nam da zakres obejmujący wszystkie litery, a nastepnie dodajemy 65, żeby przekonwertować to na odpowiednie kody
- obliczamy indeks tabeli lustrzanej, żeby leciał od końca. czyli od tab.length odejmujemy 1 (ostatni element to rozmiar - 1), a następnie odejmujemy aktualny iterator. wtedy w jednej pętli liczymy indeksy tablicy liczonej od początku i od końca.
- wpisujemy wartość do drugiej tablicy.

Krok 3:
- wyświetlanie uważam za opcjonalne. nie było w poleceniu.