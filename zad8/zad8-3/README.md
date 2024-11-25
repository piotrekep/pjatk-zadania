## Zad8-3

przeszukiwanie tablicy znaków w poszukiwaniu sekwencji znaków
- deklarujemy zmienną która przechowuje nam czy jest match
- następnie zmienną która będzie przechowywała indeks pod którym jest początek szukanego ciągu w szukanym
- test czy ciąg którego szukamy mieści się w przeszukiwanym - czy w ogóle jest sens szukać
- lecimy po elementach tablicy
    - warunek w for musi być <=, bo trzeba uwzględnić pierwszy(zerowy) element ostatniej możliwej lokalizacji szukanego ciągu
- sprawdzamy czy w indeksie w którym jesteśmy zaczyna się szukany ciąg
    - dla każdego kolejnego indeksu w przeszukiwanej tablicy porównujemy wszystkie kolejne litery szukanego ciągu
    - kolejno jeżeli pierwssa litera się zgadza, to match=true, jeżeli następna, to też. Jeśli w którymś momencie nie będzie się zgadzać to kasujemy match i przerywamy dalesze sprawdzanie, żeby przeskoczyć do następnego indeksu przeszukiwanej tablicy
- printujemy indeks w którym był każdy kolejny match
