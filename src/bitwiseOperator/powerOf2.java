package bitwiseOperator;

import java.util.Scanner;

public class powerOf2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if((num & (num-1)) == 0 ){
            System.out.println("It's a power of 2");
        }else{
            System.out.println("It's not.");
        }
    }
}
