package Array;

import java.util.Scanner;

public class ArrayAddition {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of needed array: ");
        int n = sc.nextInt();
        int arr [] = new int [n];
        int arrSum = 0;
        for (int i = 0; i < n; i++){
            System.out.print("Enter the value for index [" + i + "] :" );
            arr[i] = sc.nextInt();
            //arrayAddition
            arrSum = arrSum + arr[i];
        }
        System.out.print("Sum for the array is : " + arrSum);


    }
}
