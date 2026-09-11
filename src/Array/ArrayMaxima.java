package Array;

import java.util.Scanner;

public class ArrayMaxima {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of needed array: ");
        int n = sc.nextInt();
        int arr [] = new int [n];
        int max = 0;
        for (int i = 0; i < n; i++){
            System.out.print("Enter the value for index [" + i + "] :" );
            arr[i] = sc.nextInt();

            if (max < arr[i]){
                max = arr[i];
            }else{
                continue;
            }
        }
        System.out.print("Maxima of the Array is : "+ max);
    }
}
