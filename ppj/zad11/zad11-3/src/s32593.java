public class s32593 {
    public void method(){
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();


        cat.makeSound();
        dog.makeSound();
        cow.makeSound();
    }
}

class Animal{
    protected String species;

    public Animal(String species){
        this.species = species;
    }

    public void makeSound(){
        System.out.println("Unknown");
    }

}


class Cat extends Animal{
    Cat(){
        super("Cat");
    }

    @Override
    public void makeSound(){
        System.out.println("Meow");
    }

}

class Dog extends Animal{
    Dog(){
        super("Dog");
    }

    @Override
    public void makeSound(){
        System.out.println("Woof");
    }

}
class Cow extends Animal{
    Cow(){
        super("Cow");
    }

    @Override
    public void makeSound(){
        System.out.println("Moo");
    }
}