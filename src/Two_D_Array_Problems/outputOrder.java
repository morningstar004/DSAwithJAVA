package Two_D_Array_Problems;

import java.sql.Array;

public class outputOrder {
    public static void wavePrint(int[][] nums){
        int rowLength = nums.length;
        int colLength = nums[0].length;
        for(int col = 0; col < colLength; col++){
            if(col%2==0){
                for (int[] num : nums) {
                    System.out.println(num[col]);
                }
            }else{
                for( int row = rowLength - 1; row >=0 ; row--){
                    System.out.println(nums[row][col]);
                }
            }
        }
    }

    public static int[][] transpose(int[][] nums){
        int rowLength = nums.length;
        int colLength = nums[0].length;
        int [][] ans = new int[colLength][rowLength];
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                ans[col][row] = nums[row][col];
            }
        }
        return ans;
    }

    public static void printArray(int[][] nums) {
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                System.out.print(nums[row][col] + " ");
            }
            System.out.println();
        }
    }

    static void main() {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        wavePrint(arr);
        printArray(arr);
        printArray(transpose(arr));
    }
}
