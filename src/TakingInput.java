import java.util.Scanner;

public class TakingInput {
    static void main(){
        System.out.print("Enter value of a : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Emter value of b : ");
        int b = sc.nextInt();
        System.out.println(a+b);
    }
}
