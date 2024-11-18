## Zad 7-1

Krok po kroku

- trzy tablice o losowym rozmiarze
- wypełniamy trzy tablice losowymi wartościami
- tworzymy tablice dwuwymiarową
- wyświetlamy zawartość tablicy dwuwymiarowej przy pomocy foreach zagnieżdżonego w foreachu. pierwszy for leci po tablicach zawierających tablice, a drugi po tablicach zawartych w tablicach :D

Mamy tablicę tablic, więc wybieramy pierwszą i printujemy jej zawartość element po elemencie, potem drugą i trzecią tak samo

```java

        for (int[] is : tab2d) { // instrukcja wybiera element tablicy zawierający tablice
            for (int is2 : is) { //wybiera element z tablicy która jest elementem
                System.out.println(is2); //printuje
            }        
        }
```
