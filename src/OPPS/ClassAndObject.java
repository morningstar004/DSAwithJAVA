package OPPS;
class Car {
    String brand;
    int year;

    //constructor function (Setter function)
    Car(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    //constructor function (getter function)
    void display(){
        System.out.println("Brand : "+brand+" ,Year : "+year);
    }

}
public class ClassAndObject {
    static void main() {
        Car car1 = new Car("Toyota",2020);
        car1.display();

        Car car2 = new Car("Ford",2018);
        car2.display();
    }
}
