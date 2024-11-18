## zad7-2

w wymaganiach nie było do .. while dodałem do testów.
printowania też nie było

- tworzymy tablice int[][]
- zmienne przekatnaLP przechowują wynik testu czy są 3 takie same liczby
- wypełniamy tablice randomami
- wypełniając sprawdzamy czy jesteśmy na przekątnej lewej "i==j" i prawej "i==(arr[i].length-1-j)"
    - (arr[i].length-1-j) oblicza odwrotny indeks długość tablicy  minus 1 minus aktualny indeks daje odwrotny
- jeśli jesteśmy na przekątnej i w rzędzie większym o conajmniej ilość powtórzeń(żeby nie sprawdzać bez sensu) to sprawdzamy wszystkie poprzednie
- przy dodaniu nowej liczby na przekątnej zliczamy jej aktualne wystąpienia
- jeśli osiągamy wymaganą ilość powtórzeń to ustawiamy flagę i przestajemy sprawdzać
- to samo dla drugiej przekątnej. różnią się tylko obliczaniem odwrotnego indeksu
