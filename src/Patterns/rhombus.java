package Patterns;
import java.util.Scanner;

public class rhombus {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of rhoumbus : ");
        int n = sc.nextInt();
        for (int a = n; a >= 0 ; a-- ){
            for(int b = a; b >= 0; b-- ){
                System.out.print(" ");
            }
            for(int b = n; b > 0; b-- ){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
