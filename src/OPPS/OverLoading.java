package OPPS;
class Print {
    void display(int num) {
        System.out.println("Integer: " + num);
    }

    void display(double num) {
        System.out.println("Double: " + num);
    }

    void display(String text) {
        System.out.println("String: " + text);
    }
}

public class OverLoading {
    public static void main(String[] args) {
        Print obj = new Print();
        obj.display(10);       // Calls int version
        obj.display(3.14);     // Calls double version
        obj.display("Hello");  // Calls String version
    }
}