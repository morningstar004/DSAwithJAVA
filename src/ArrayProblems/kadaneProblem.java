package ArrayProblems;
public class kadaneProblem {
    public static int kadane(int[] nums){
        int sum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            sum = sum + num;
            MaxSum = Math.max(MaxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return MaxSum;
    }

    static void main() {
        int [] arr = {-1,-1,2,5,-3,2,-4,8,-4,1,-1,-2};
        System.out.println(kadane(arr));
    }
}
