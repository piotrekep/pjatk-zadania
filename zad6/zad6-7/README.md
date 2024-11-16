## Zad6-7
Kolega NieJaf zwrócił uwage, że tablica jest pomieszana, więc poprzednia wersja rozwiązanie jest zła.

normalnie bym zrobił wynik = slowa[1] + " " + slowa[3] + " " + slowa[2] + " " + slowa[5] + " " +  slowa[6] + " " +  slowa[3] + " " +  slowa[7];

a, że mam dziś słabszy dzień robimy tak:

Nowy program:
- inicujuemy tablice zgodnie z zadniem
- deklarujemy pusty string
- instrukcja while której warunkeim jest porównanie obiektów, naszego wyniku i stringa wzorcowego. Bedzie ona wykonywana aż wynik będzie poprawny.
- w while jest for który buduje nam zdanie z siedmiu słów losowo wybranych z tablicy
- jeśli słowo nie jest ostatnim słowem to wstawia spacje pomiędzy nimi

