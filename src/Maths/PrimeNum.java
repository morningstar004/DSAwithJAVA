package Maths;
import java.util.Scanner;
public class PrimeNum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1 ; i <= num ; i++){
            if(num%i == 0){
                count++;
            }
        }
        System.out.println(count);
        if(count == 2){
            System.out.println("It's a Prime Number.");
        }else{
            System.out.println("Not a Prime Number.");
        }
    }
}
