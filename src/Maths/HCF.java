package Maths;
public class HCF {
    static int HCFfun(int a, int b){
        int collector = 1;
        int bigone = Math.max(a,b);
        for(int i = 2 ; i <= bigone ; i++){
            if(a%i == 0 && b%i == 0){
                    collector = i;
            }
        }
        return collector;
    }
    static int LCM(int a ,int b){
        int gdc = HCFfun(a,b);
        return (a*b)/gdc;

    }
    static void main() {
        System.out.println(HCFfun(5941,5928));
        System.out.println(LCM(45,56));
    }
}

//Or
//