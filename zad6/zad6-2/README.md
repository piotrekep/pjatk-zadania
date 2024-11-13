## Zad 6-2

Tak jak w poprzednim zadaniu. tablica dziesięciu intów

pętla for leci po wszystkich elementach tablicy.
Math.random() generuje losową liczbę typu double z zakresu 0 do 1 z wyłączeniem jedynki.
Math.round() zaokrągla argument typu double.
(int) to rzutowanie typu. Konwertujemy typ double który zwraca nam round() na int, żeby go wpisać do tablicy

i (int) Math.round(Math.random()); - analizujemy od najbardziej wewnętrznej metody.
- wygeneruj losową liczbe
- zaokaglij 
- konwertuj na int
- przypisz do tablicy


Drugi sposób:
wynik Math.random() mnożymy razy 2, co przeskaluje nam wynik z domyślnego zakresu 0 do 0.999(9) na 0 do 1.999.
Następnie obcinamy to co po przecinku przy pomocy rzutowania na typ int, i gotowe.
Uwaga na kolejność operacji. jak zrobimy (int)math.random()*2 to najpierw wykona się rzutowanie, a potem mnożenie więc tablica wypełni się zerami.
Trzeba mnożenie wstawić w nawias (int)(math.random()*2)
