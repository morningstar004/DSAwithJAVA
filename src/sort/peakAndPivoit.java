package sort;

public class peakAndPivoit {
    public static int PeakElement(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            } else if (arr[mid] >= arr[mid + 1]) {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int pivoitIndex(int[] arr){
        int n = arr.length;
        int start = 0;
        int end = n - 1;

//        int ans = -1;
        if(arr[start] < arr[end]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] <= arr[n-1]){
                end = mid - 1;
            } else if (arr[mid] > arr[n-1]) {
                start = mid + 1;
            }
        }
        return start;
    }
    public static int binerySearch(int[] arr, int target, int start, int end){
        int n = arr.length;
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
    public static int searchInPovitedArr(int[] arr,int target){
        int n = arr.length;
        int pivot = pivoitIndex(arr);
        int LStart = 0;
        int LEnd = pivot;
        int RStart = LEnd + 1;
        int REnd = n - 1;

        if(pivoitIndex(arr) == -1){
            int ans = binerySearch(arr,target,0,n-1);
            return ans;
        }

        if(arr[LStart] <= target && target <= arr[LEnd]){
            return binerySearch(arr,target,LStart,LEnd);
        }

        return binerySearch(arr,target,RStart,REnd);
    }

    static void main() {
        int[] arr = {0,1,2,3,4,2,1,0,-1};
        int[] nums = {4,5,6,7,0,1,2};
        int[] brr = {-66,-67};

        System.out.println(PeakElement(arr));
        System.out.println(pivoitIndex(brr));
        System.out.println(searchInPovitedArr(nums,6));

    }
}
