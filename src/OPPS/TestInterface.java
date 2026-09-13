package OPPS;

// Interface (100% abstraction)
interface AnimalB {

    // By default: public and abstract
    void sound();
}

// Class implementing the interface
class Cat implements AnimalB {

    // Must implement the method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class TestInterface {
    public static void main(String[] args) {

        // Interface reference
        AnimalB obj = new Cat();

        // Calls implemented method
        obj.sound();
    }
}
