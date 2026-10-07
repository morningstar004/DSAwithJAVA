package sort;

public class Search {
    public static int binerySearch(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return -1;
    }
    public static int getLowerBound(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = n;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] >= target){
                ans = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int getUpperBound(int[] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n;
        while(start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] > target) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int countFig(int[] arr, int target){
        int Upper = getUpperBound(arr,target);
        int Lower = getLowerBound(arr,target);
        return Upper - Lower;
    }

    static void main() {
        int[] arr = {1,2,3,3,3,3,3,4,4,4,5,6,7,8,9};
        System.out.println(countFig(arr,3));
        System.out.println(binerySearch(arr,3));
    }
}
