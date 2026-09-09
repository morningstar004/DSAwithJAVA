package Patterns;
import java.util.Scanner;

public record invertendSolidTriangle() {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Height of Triangle : ");
        int height = sc.nextInt();

        for(int row = 1; row <= height ;row++){
            for(int space = 1; space <= row - 1; space++){
                System.out.print(" ");
            }
            for( int column = 1 ;column <= 2*height-row-(row-1) ;column++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
