package sort;

public class alocationProblems {

    public static int BookAlocation (int[] arr, int minAlocation){
        int k = minAlocation;
        if (k > arr.length) {
            return -1;
        }
        int s = 1;
        int sum = 0 ;
        for (int j : arr) {
            sum += j;
        }
        int e = sum;
        int ans  = -1;

        while(s <= e){
            int mid = s + (e-s)/2;
            if(isValid(arr, k, mid)){
                ans = mid;
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return ans;
    }

    public static Boolean isValid(int[] arr, int k, int maxPage){
        int studentCount = 1;
        int page = 0;
        for(int i = 0; i < arr.length; i++){
            if(page + arr[i] <= maxPage){
                page = page + arr[i];
            }else {
                studentCount++;
                page = 0;
                if(studentCount > k ){
                    return false;
                }
            }
        }
        return true;
    }

    static void main() {
        int[] arr = {12, 34, 67, 90};
        int k = 2;

        System.out.println(BookAlocation(arr, k));
    }
}
