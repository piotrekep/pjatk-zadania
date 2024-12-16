### **Zad11-3**

---

#  Polimorfizm z wykorzystaniem klasy `Animal`

## **Opis projektu**

Program demonstruje koncepcję **polimorfizmu** oraz przesłaniania metod w języku **Java**. W projekcie stworzono hierarchię klas, gdzie klasy pochodne przesłaniają metodę `makeSound()` z klasy bazowej `Animal`, aby dostosować jej działanie do specyfiki każdego zwierzęcia.

---

## **Struktura projektu**

### **1. Klasa `Animal` (bazowa)**  
- **Pola**:  
   - `String species` – nazwa gatunku.  
- **Metody**:
   - `makeSound()` – domyślna implementacja, wypisuje `"Unknown"`.  

```java
class Animal {
    protected String species;

    public Animal(String species) {
        this.species = species;
    }

    public void makeSound() {
        System.out.println("Unknown");
    }
}
```

---

### **2. Klasy pochodne: `Cat`, `Dog`, `Cow`**  
Każda z klas przesłania metodę `makeSound()` z klasy `Animal` za pomocą adnotacji **`@Override`**, aby dostarczyć unikalny dźwięk.

#### Przykład dla klasy `Cat`:
```java
class Cat extends Animal {
    Cat() {
        super("Cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
```

- **`@Override`** informuje kompilator, że metoda **przesłania** metodę z klasy bazowej.  
- Dzięki temu, jeśli nazwa lub sygnatura metody w klasie bazowej zostaną zmienione, kompilator zgłosi błąd.

**Pozostałe klasy**:
- **`Dog`** → Dźwięk: `"Woof"`  
- **`Cow`** → Dźwięk: `"Moo"`

---

### **3. Klasa główna `s32593`**

W klasie głównej demonstrujemy mechanizm **polimorfizmu**, tworząc obiekty różnych klas pochodnych i wywołując metodę `makeSound()`.

```java
public class s32593 {
    public void method() {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        cat.makeSound(); // Meow
        dog.makeSound(); // Woof
        cow.makeSound(); // Moo
    }
}
```

---

## **Wyjaśnienie adnotacji `@Override`**

Adnotacja **`@Override`**:
1. **Wskazuje**, że metoda przesłania metodę z klasy bazowej.
2. **Zapobiega błędom**:
   - Jeśli metoda w klasie bazowej zostanie zmieniona (nazwa lub sygnatura), kompilator zgłosi błąd.
3. **Poprawia czytelność** kodu, jednoznacznie wskazując intencję programisty.

**Przykład**:
```java
@Override
public void makeSound() {
    System.out.println("Meow");
}
```

---

## **Przykładowy wynik działania programu**

```
Meow
Woof
Moo
```

---

## **Podsumowanie**

Program pokazuje:
- **Polimorfizm** – metoda `makeSound()` zachowuje się inaczej w zależności od typu obiektu.  
- **Przesłanianie metod (`@Override`)** – klasy pochodne dostosowują działanie metody z klasy bazowej.  
- **Czytelność i modularność kodu** – każdy typ zwierzęcia jest reprezentowany przez osobną klasę.

Program stanowi czytelny przykład zastosowania **dziedziczenia** i **polimorfizmu** w Javie.
