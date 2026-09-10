package Patterns;
import java.util.Scanner;

public class hollowKite {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diagonal value : ");
        int diagonal = sc.nextInt();

        for(int row = 1; row <= diagonal; row++ ){
            for(int space = 1; space <= diagonal-row; space++){
                System.out.print(" ");
            }
            if(row == 1){
                for(int col = 1; col <= 2*row-1 ; col++){
                    System.out.print(" *");
                }
            }else{
                System.out.print("*");

                for(int col = 1; col <= 2*row-1 ; col++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row = 1 ; row <= diagonal; )
    }
}
