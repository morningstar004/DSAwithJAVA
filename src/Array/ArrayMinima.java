package Array;
import java.util.Scanner;
public class ArrayMinima {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of needed array: ");
        int n = sc.nextInt();
        int arr [] = new int [n];
        int mix = 999999999;
        for (int i = 0; i < n; i++){
            System.out.print("Enter the value for index [" + i + "] :" );
            arr[i] = sc.nextInt();

            if (mix > arr[i]){
                mix = arr[i];
            }else{
                continue;
            }
        }
        System.out.print("Maxima of the Array is : "+ mix);
    }
}
