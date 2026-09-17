package bitwiseOperator;

import java.util.Scanner;

public class EvenOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if((num & 1) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
