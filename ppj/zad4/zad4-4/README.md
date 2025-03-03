## Zad 4-4

Uprościć (!(a<b) && !(a>b))

- ((a>=b) && (a<=b)); //odwracamy porównania, żeby usunąć negacje
- ((a==b) && (a==b)); //dwa przeciwne porównania po obu stronah AND wykluczają sie
- a==b; //obie strony AND są równe, usuwamy redundantny kod
