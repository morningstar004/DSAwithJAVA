package Patterns;

import java.util.Scanner;

public class solidPyramid {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of pyramid : ");
        int h = sc.nextInt();
        for(int a = 0 ; a <= h ; a++ ){
            for (int b = 1; b <= h - a; b++){
                System.out.print(" ");
            }
            for(int c = 1; c <= 2*a-1; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
