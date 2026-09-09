package Patterns;
import java.util.Scanner;

public class InvertedRightAngledTrinagle {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Height : ");
        int height = sc.nextInt();

        for ( int a = height ; a > 0 ; a-- ){
            for ( int b = a ; b > 0 ; b-- ){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
