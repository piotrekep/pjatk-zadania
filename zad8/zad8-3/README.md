## Zad8-3

update:
okazuje się, że trzeba przeszukać tablice pod kątem występowania znaków w ciągu a nie ciągu
- lecimy po wszystkich znakach ciągu
- kolejny for który sprawdza wszystkie poprzednie znaki czy nie przerabialiśmy już aktualnego znaku
- jeśli znajdziemy znak równy aktualnemu, czyli taki który już przerabialiśmy przerywamy, i ustawiamy flage, żeby nie porównywać
- jeśli znak się nie powtórzył to zerujemy licznik wystąpień i porównujemy aktualny znak z tablicą zliczając wystąpienia.
- po dojściu do końca printujemy wynik



