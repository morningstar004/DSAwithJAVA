package Patterns;
import java.util.Scanner;

public class solidBlockPattern{
    static void main(){
        //should take input for row and columns
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the no. of columns: ");
        int columns = sc.nextInt();

        for (int b = 0 ; b < row ; b++ ){
            for (int a = 0 ; a < columns ; a++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}