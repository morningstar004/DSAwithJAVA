package Patterns;
import java.util.Scanner;

public class hollowtriangle {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of the triangle : ");
        int height = sc.nextInt();

        for(int row = 1; row <= height ; row++){
            for(int space = 1; space <= height-row ; space++ ){
                System.out.print(" ");
            }
            if(row == 1 || row == height){
                for(int col = 1 ; col <= row*2-1; col++){
                    System.out.print("*");
                    }
                }else {
                System.out.print("*");
                for(int col=1 ; col <=2*row-3 ; col++){
                    System.out.print(" ");
            }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
