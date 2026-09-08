public class forLoop{
    static void main(){
        for( int x = 0; x <= 10; x++) {
            System.out.print("Print Count: ");
            System.out.println(x);
        }
        for( int x = 10; x >= 0; x--) {
            System.out.print("Print Reversed Count: ");
            System.out.println(x);
        }
        for( int a = 0; a <= 5; a++){
            for( int b = a ; b >= 0; b--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}