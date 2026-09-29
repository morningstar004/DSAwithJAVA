package ArrayProblems;

public class targetSum {

    public static int [] sumTaget(int [] arr, int target){
        for (int i = 0; i < arr.length; i++){
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[i]+arr[j] == target){
                    int [] ans = {arr[i],arr[j]};
                    return ans;
                }
            }
        }
        return null;
    }

    public static int [] tripletSum(int [] arr, int target) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        int[] ans = {arr[i], arr[j], arr[k]};
                        System.out.println(arr[i] + ", " + arr[j] + " and " + arr[k]);
                        return ans;
                    }
                }
            }
        }
        return null;
    }
    static void main() {
        int [] arr = {1,5,4,6,7,9,4,5,6};
        tripletSum(arr,22);
    }
}