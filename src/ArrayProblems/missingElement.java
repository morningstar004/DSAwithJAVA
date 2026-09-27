package ArrayProblems;

public class missingElement {
    public static int missingNum(int[] arr){
        int missingPiece = 0;
        for (int _ : arr){
            for (int j : arr) {
                if (missingPiece == j) {
                    missingPiece++;
                }
                if(missingPiece == arr.length){
                    return missingPiece;
                }
            }
        }
        return missingPiece;
    }
    //OR

    public static int missingElement(int[] arr){
        int l = arr.length;
        int arraySum = ((l+1)/2)*l;
        int Value = 0;
        for(int i : arr){
            Value = Value + i;
        }
        return Value - arraySum;
    }

    //OR
    public static int missingXORElement(int[] arr){
        int xorSum = 0;
        for(int n: arr) {
            xorSum = xorSum ^ n;
        }
        int n = arr.length;
        for(int i=0; i<=n; i++) {
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }
    static void main() {
        int[] arr = {4,6,7,5,8,1,3,0};
        System.out.println(missingNum(arr));
        System.out.println(missingElement(arr));
        System.out.println(missingXORElement(arr));
    }
}
