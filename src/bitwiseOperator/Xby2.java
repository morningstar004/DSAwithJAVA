package bitwiseOperator;
import java.util.Scanner;



public class Xby2 {
    public static int MultiplyBy2(int num){
        return num << 1;
    }

    public static int DivideBy2(int num){
        return num >> 1;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("Two Times of your number is : "+MultiplyBy2(num));
        System.out.println("Your number divide by 2 : " +DivideBy2(num));
    }
}
