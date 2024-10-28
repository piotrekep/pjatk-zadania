## Zad 4 - 5

Porównanie trzech zmiennych przy pomocy "?"

(test logiczny) ? (prawda) : (fałsz)

więc zagnieżdzamy jedną operacje w drugiej:

(czy A==B?) ? ((czy B==C?) ? "są równe" : "nie równe") : "nie równe"

Jeśli pierwszy test jest prawdziwy, to wykonywany jest drugi i zwraca prawdę drugiego.
Jeśli pierwszy jest fałszywy, to drugi jest pomijany
Jeśli pierwszy jest prawdziwy, a drugi fałszywy to zwraca wartość fałsz drugiego
