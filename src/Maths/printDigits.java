package Maths;

import java.util.Scanner;

public class printDigits {
    static void main() {
        Scanner dc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int Num = dc.nextInt();
        int digits = String.valueOf(Num).length();

        for(int i = 0; i < digits ; i++ ){
            int remender = Num%10;
            Num = Num/10;
            System.out.println(remender);
        }
    }
}
