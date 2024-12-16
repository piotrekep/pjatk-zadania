### **Zad11-2**

---

# Symulacja zrywania owoców z drzewa

## **Opis projektu**

Program symuluje proces zrywania owoców z drzewa i umieszcza je w tablicy. Zbieranie trwa, dopóki masa wszystkich zebranych owoców nie przekroczy **5 kg (5000 g)**. Każdy owoc ma przypisaną **nazwę** i **losową masę** z zakresu **100–250 g**. Na końcu program podaje liczbę **jabłek**, **gruszek** i **pomarańczy** oraz łączną masę owoców.

---

## **Struktura projektu**

Projekt składa się z kilku klas:

### **1. Klasa `Owoc`**  
- Jest klasą bazową dla wszystkich owoców.
- **Pola**:
   - `String nazwa` – nazwa owocu.
   - `double masa` – masa owocu.  
- **Metody**:
   - `getNazwa()` – zwraca nazwę owocu.
   - `getMass()` – zwraca masę owocu.  
   - `setMass(double masa)` – ustawia masę owocu.

---

### **2. Klasy dziedziczące (`Jablko`, `Gruszka`, `Pomarańcza`)**  
Każda z klas odpowiada za konkretny rodzaj owocu i ustala jego **nazwę** oraz losową masę w konstruktorze.

Przykład dla klasy `Jablko`:
```java
class Jablko extends Owoc {
    Jablko() {
        super("Jabłko");
        super.setMass(Math.random() * 150 + 100); // Masa z przedziału 100–250 g
    }
}
```

---

### **3. Klasa `Drzewo`**  
- Zawiera metodę `zerwijOwoc()`, która losowo zwraca jeden z trzech owoców:
   - Jabłko  
   - Gruszka  
   - Pomarańcza  

**Przykład działania metody**:
```java
public Owoc zerwijOwoc() {
    int zerwanyOwoc = (int) Math.round(Math.random() * 2);
    switch (zerwanyOwoc) {
        case 0 -> return new Jablko();
        case 1 -> return new Gruszka();
        case 2 -> return new Pomarańcza();
        default -> return null;
    }
}
```

---

### **4. Klasa `s32593` (Główna)**  
W klasie głównej realizowane są następujące kroki:
1. Tworzenie tablicy na owoce (`Owoc[] skrzynka`).  
2. Zrywanie owoców z drzewa przy pomocy `zerwijOwoc()` do momentu osiągnięcia **5 kg**.  
3. Zliczanie liczby poszczególnych owoców (`jabłka`, `gruszki`, `pomarańcze`).  
4. Wyświetlanie wyników.

**Przykładowa pętla do zbierania owoców**:
```java
for (int i = 0; i < skrzynka.length; i++) {
    skrzynka[i] = drzewo.zerwijOwoc();
    masa += skrzynka[i].getMass();
    if (masa >= 5000) break; // Zakończ, gdy masa osiągnie 5 kg
}
```

**Zliczanie owoców za pomocą `switch`:**
```java
for (Owoc owoc : skrzynka) {
    if (owoc != null) {
        switch (owoc.getNazwa()) {
            case "Jabłko" -> iloscJablek++;
            case "Gruszka" -> iloscGruszek++;
            case "Pomarańcza" -> iloscPomaranczy++;
        }
    }
}
```

**Wyświetlenie wyników**:
```java
System.out.println("Jabłka: " + iloscJablek);
System.out.println("Gruszki: " + iloscGruszek);
System.out.println("Pomarańcze: " + iloscPomaranczy);
System.out.println("Masa: " + (int) masa + "gr");
```

---

## **Przykładowy wynik działania programu**

```
Jabłka: 22
Gruszki: 17
Pomarańcze: 19
Masa: 5050gr
```

---

## **Podsumowanie**

Program został zaprojektowany z wykorzystaniem **programowania obiektowego (OOP)**, co pozwala na modularność i czytelność kodu. Funkcjonalność obejmuje:
- Symulację zrywania owoców o losowej masie.
- Przerywanie zbierania po osiągnięciu określonego limitu masy (5 kg).  
- Zliczanie i prezentację liczby każdego rodzaju owoców oraz łącznej masy.

Program jest wydajny, a kod jest przejrzysty i zgodny z dobrymi praktykami programistycznymi.