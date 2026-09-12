package Maths;
import java.util.Scanner;
public class reverseNum {
    static void palendrom(int num){
        int digit = String.valueOf(num).length();
        int numnonrevesed = num;
        int reversed = 0;
        for(int i = 0; i < digit; i++){
            int remender = num%10;
            reversed = reversed*10 + remender;
            num = num/10;
        }
        System.out.println(reversed);
        System.out.print("Its a palendrom : ");
        System.out.println(numnonrevesed == reversed);
    }
    static void main() {
        Scanner dc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int Num = dc.nextInt();
        palendrom(Num);
        int digits = String.valueOf(Num).length();

        for(int i = 0; i < digits ; i++ ){
            int remender = Num%10;
            Num = Num/10;
//            System.out.print(remender);
        }
    }
}
