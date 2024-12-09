# Projekt: Zadanie 10-3

---

## Opis projektu
Ten projekt zawiera implementację różnych brył geometrycznych w języku Java, w tym:
- **Prostokąt**
- **Prostopadłościan**
- **Trójkąt**
- **Graniastosłup**
- **Ostrosłup**

Każda bryła posiada metody do obliczania pól powierzchni i objętości oraz prezentacji wyników.

---

## Zawartość plików

### Prostokat.java
Klasa `Prostokat` definiuje prostokąt i umożliwia obliczanie pola jego powierzchni.
- Pola:
  - `bokA`, `bokB`: wymiary prostokąta.
- Metody:
  - `Prostokat(int bokA, int bokB)`: Konstruktor przyjmujący wymiary prostokąta.
  - `show()`: Wyświetla pole powierzchni prostokąta.
  - `bokA()` i `bokB()`: Gettery zwracające wymiary prostokąta.

  

### Prostopadloscian.java
Klasa `Prostopadloscian` dziedziczy z `Prostokat` i rozszerza ją o wysokość.
- Pola:
  - `wysokosc`: Wysokość prostopadłościanu.
- Metody:
  - `Prostopadloscian(int bokA, int bokB, int wysokosc)`: Konstruktor przyjmujący wymiary podstawy i wysokość.
  - `show()`: Wyświetla pole powierzchni i objętość prostopadłościanu.

### Prostopadloscian_upr.java
Klasa `Prostopadloscian_upr` to ulepszona wersja `Prostopadloscian` z bardziej szczegółowym podejściem do obliczeń.
- Metody dodatkowe:
  - `policzPoleBoku(int bokA, int bokB)`: Oblicza pole jednego boku.
  - `policzPoleCalkowite(...)`: Oblicza całkowite pole powierzchni.
  - `policzObjetosc(...)`: Oblicza objętość bryły.

### Trojkat.java
Klasa `Trojkat` definiuje trójkąt równoboczny i umożliwia obliczanie jego pola.
- Pola:
  - `bok`: Długość boku trójkąta.
- Metody:
  - `Trojkat(int bok)`: Konstruktor przyjmujący długość boku.
  - `show()`: Wyświetla pole powierzchni trójkąta.

### Graniastoslup.java
Klasa `Graniastoslup` dziedziczy z `Trojkat` i reprezentuje graniastosłup trójkątny.
- Pola:
  - `wysokosc`: Wysokość graniastosłupa.
- Metody:
  - `Graniastoslup(int bok, int wysokosc)`: Konstruktor przyjmujący długość boku podstawy i wysokość.
  - `show()`: Wyświetla pole powierzchni i objętość graniastosłupa.

### Graniastoslup_upr.java
Klasa `Graniastoslup_upr` to ulepszona wersja klasy `Graniastoslup`, z dodatkowymi metodami:
- `poleTrojkata(...)`: Oblicza pole podstawy.
- `poleGraniastoslupa(...)`: Oblicza całkowite pole powierzchni.
- `objetoscGraniastoslupa(...)`: Oblicza objętość.

### Ostroslup.java
Klasa `Ostroslup` dziedziczy z `Trojkat` i reprezentuje ostrosłup trójkątny.
- Pola:
  - `wysokosc`: Wysokość ostrosłupa.
- Metody:
  - `Ostroslup(int bok, int wysokosc)`: Konstruktor przyjmujący długość boku podstawy i wysokość.
  - `show()`: Wyświetla pole powierzchni i objętość ostrosłupa.

### Ostroslup_upr.java
Klasa `Ostroslup_upr` to ulepszona wersja klasy `Ostroslup` z dodatkowymi metodami:
- `wysSciany(...)`: Oblicza wysokość ściany bocznej.
- `poleOstrslupa(...)`: Oblicza całkowite pole powierzchni.
- `objetoscOstroslupa(...)`: Oblicza objętość.

### s32593.java
Plik główny programu, w którym tworzonych jest kilka obiektów każdej bryły. Metody `show()` są wywoływane w celu zaprezentowania wyników obliczeń.

---

## Wyjaśnienie kodu

Każda klasa implementuje odpowiednie metody pozwalające obliczyć pola powierzchni i objętości. Klasy ulepszone (`*_upr`) wprowadzają dodatkowe metody, które dzielą obliczenia na mniejsze kroki, poprawiając czytelność i łatwość wprowadzania zmian.

---

## Przykładowy wynik działania programu
```
Pole powierzchni prostokąta: 36  
Pole powierzchni trójkąta: 15.588  
Pole powierzchni prostopadłościanu: 216  
Objętość prostopadłościanu: 216  
Pole powierzchni ostrosłupa: 93.528  
Objętość ostrosłupa: 31.176  
Pole powierzchni graniastosłupa: 124.704  
Objętość graniastosłupa: 93.528
```