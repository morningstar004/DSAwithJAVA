package OPPS;

class Janver {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class kutta extends Janver {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class billi extends Janver {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        Janver a;

        a = new kutta();
        a.sound(); // Output: Dog barks

        a = new billi();
        a.sound(); // Output: Cat meows
    }
}