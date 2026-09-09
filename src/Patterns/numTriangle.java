package Patterns;
import java.util.Scanner;

public class numTriangle {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int height = sc.nextInt();

        for(int row = 1 ; row <= height; row++ ){
            for(int space = 1; space <= height-row; space++ ){
                System.out.print(" ");
            }
            for(int column = 1; column <= row*2-1; column++ ){
                System.out.print(row);
            }
            System.out.println();
        }

    }
}
