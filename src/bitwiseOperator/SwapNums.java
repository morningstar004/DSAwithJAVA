package bitwiseOperator;

import java.util.Scanner;

public class SwapNums {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for a : ");
        int a = sc.nextByte();
        System.out.print("Enter the value for b : ");
        int b = sc.nextInt();

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Value of a : "+a+" and b : "+b);
    }
}
