package Array;

import java.util.Scanner;

public class _2D_ArrayFilling {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of needed array: ");
        int n = sc.nextInt();
        //we are creating a square array
        int arr [][] = new int [n][n];

        for (int a = 0 ; a < n ; a++){
            for( int b = 0 ; b < n ; b++){
                System.out.print("Fill the value of array[" + a + "][" + b + "]");
                arr[a][b] = sc.nextInt();
            }
        }

        for (int a = 0 ; a < n ; a++){
            for( int b = 0 ; b < n ; b++){
                System.out.print(arr[a][b] + " ");
            }
            System.out.println();
        }
    }
}
