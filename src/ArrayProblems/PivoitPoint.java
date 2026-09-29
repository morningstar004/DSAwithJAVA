package ArrayProblems;
public class PivoitPoint {
    public static int pivoit(int [] nums){
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        leftSum[0] = nums[0];
        for(int i = 1; i < n; i++){
            leftSum[i] = nums[i-1] + nums[i];
        }
        rightSum[n-1] = nums[n-1];
        for(int j = n-2; j >= 0; j--){
            rightSum[j] = nums[j+1] + nums[j];
        }

        for(int i = 0; i < n; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }

    static void main() {
        int [] arr = {1,2,3,4,5,6,2,1,1};

        System.out.println(pivoit(arr));
    }
}
