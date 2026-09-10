package Patterns;

import java.util.Scanner;

public class kite {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diagonal of the kite : ");
        int diagonal = sc.nextInt();

        for(int row = 1; row <= diagonal; row++){
            for( int space = 1 ; space <= diagonal-row ; space++){
                System.out.print(" ");
            }
            for(int col = 1; col <= 2*row-1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = 1; row < diagonal; row++ ){
            for(int space = 1; space <= row ; space++){
                System.out.print(" ");
            }
            for(int col = 1 ; col <= diagonal - (2 * (row-2)); col++ ){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
