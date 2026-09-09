package Patterns;
import java.util.Scanner;

public class rightAngledTrangle {
    static void main(){
        //taking input for the height of trangle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Height of triangle: ");
        int height = sc.nextInt();
        for ( int a = 0 ; a < height ; a++){
            for( int b = a ; b >= 0 ; b--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
