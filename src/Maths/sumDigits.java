package Maths;
import java.util.Scanner;
public class sumDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int Num = sc.nextInt();

        int size = String.valueOf(Num).length();
        int Sum = 0;
        for(int i = 0 ; i < size ; i++){
            int remender = Num%10;
            Num = Num/10;
            Sum = Sum + remender;
        }
        System.out.println(Sum);

    }
}
