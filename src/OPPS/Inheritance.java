package OPPS;

class AnimalC {
    void eat() {
        System.out.println("Eating...");
    }
}

class DogC extends AnimalC {
    void bark() {
        System.out.println("Barking...");
    }
}

class CatC extends AnimalC {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class Inheritance{
    static void main(String[] args) {
        DogC Dog1 = new DogC();
        Dog1.bark();
        Dog1.eat();
    }
}