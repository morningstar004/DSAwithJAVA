package OPPS;
// Abstract class (cannot be instantiated)
abstract class Animal {

    // Abstract method (no body)
    // This forces child classes to provide implementation
    abstract void sound();

    // Concrete method (already implemented)
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Child class inheriting abstract class
class Dog extends Animal {

    // Providing implementation of abstract method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstraction {
    public static void main(String[] args) {

        // We cannot do:
        // Animal a = new Animal();

        // Instead, we create object of child class
        // but reference it using parent (abstract class)
        Animal obj = new Dog();

        // Calls overridden method (runtime polymorphism)
        obj.sound();

        // Calls concrete method from abstract class
        obj.sleep();
    }
}
