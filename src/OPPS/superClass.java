package OPPS;

class AnimalD {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class DogD extends AnimalD {
    void eat() {
        super.eat(); // Calls parent class method
        System.out.println("Dog is eating");
    }
}

public class superClass {
    public static void main(String[] args) {
        AnimalD newDog = new DogD();
        newDog.eat();
    }
}