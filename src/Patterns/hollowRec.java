package Patterns;

import java.util.Scanner;

public class hollowRec {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The value of rows: ");
        int height = sc.nextInt();

        for( int row = 1; row <= height; row++){
            for( int col = 1; col <= 6; col++){
                if(row == 1 || row == height){
                    System.out.print("* ");
                }else{
                    if(col == 1 || col == 6){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
