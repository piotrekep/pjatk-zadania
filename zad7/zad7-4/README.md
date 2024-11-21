## Zad7-4

- flaga sorted do komunikowania, że jest posortowane
- zmienna buff to bufor potrzebny do sortowania
- standardowo generujemy tablice randomów 
- wyswietlamy zeby mieć porównanie

Sortowanie po wierszach!
- forem lecimy po tablicy od góry do dołu
- wchodząc do wiersza ustawiamy flagę, że jest nie posortowany
- zaczynamy algorytm sortowania. while będzie się kręcił aż będzie posortowane
- ustawiamy flagę że jest gotowe na wypadek gdyby było posortowane
- sprawdzamy lecimy po elementach i sprawdzamy czy są posortowane porównując każdy z następnym
- jeśli wykonały się jakieś ruchy to znaczy, że nie jest posortowany więc kasujemy flagę. Gdyby nic nie trzeba było zmieniać, to flaga by została
- sortowanie polega na przekładaniu elementów miejscami z użyciem bufora do czasu aż nie będzie trzeba robić innych zmian
- printujemy posortowaną tablice

Sortowanie po wierszach tak jak było na konsultacjach
- forem lecimy po tablicy od góry do dołu
- resetujemy ilość przejść
- while który kręci się tak długo aż liczba przejść będzie równa długości tablicy
- for który robi przejścia. stosujemy pre inkrementacje, żeby pominąć porównanie zerowego elementu
- pick sort działa tak, że zaczynamy od pierwszego elementu. następnie porównujemy z kolejnym, jeśli się znajdzie jakiś mniejszy, to zamieniamy miejscami.
- po pełnym przejściu, wiemy, że pierwszy element jest na pewno najmniejszy. 
- w kolejnym przejściu (pass==1) porównujemy element 1 z każdym następnym i tak w kółko