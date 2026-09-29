package ArrayProblems;

public class removingDuplicates {
    public static int duplicates(int [] arr){
        int i = 0 ;
        int j = 1 ;
        while(j < arr.length){
            if(arr[j] == arr[i]){
                j++;
            } else{
                i++;
                arr[i] = arr[j];
                j++;
            }
        }
        return i+1;
    }
    static void main() {
        int[] arr = {1,2,2,2,3,3,4,4,4,5,6,6,7};
        System.out.println(duplicates(arr));

    }
}
