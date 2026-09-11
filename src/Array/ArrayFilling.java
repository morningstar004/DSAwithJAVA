package Array;
import java.util.Scanner;

public class ArrayFilling {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array: ");
        int n = sc.nextInt();
        int arr [] = new int [n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter the value for index [" + i + "] :" );
            arr[i] = sc.nextInt();
        }
        System.out.print("Your Array is : { ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+",");
        }
        System.out.print("}");
        sc.close();
    }
}
