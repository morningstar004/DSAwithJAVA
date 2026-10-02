package Two_D_Array_Problems;
import java.util.ArrayList;
import java.util.List;

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

    public static int[][] rotateArray(int[][] nums){
        int rowLength = nums.length;
        int colLength = nums[0].length;
        //new array
        int [][] ans = new int[colLength][rowLength];
        //transpose of array
        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength; col++) {
                ans[col][row] = nums[row][col];
            }
        }
        //row reverse
        for (int row = 0; row < rowLength; row++){
            int startCol = 0;
            int endCol = colLength-1;
            while(startCol <= endCol){
                int temp;
                temp = ans[row][startCol];
                ans[row][startCol] = ans[row][endCol];
                ans[row][endCol] = temp;
                startCol++;
                endCol--;
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

    public static List<Integer> spiralPrint(int[][] nums){
        List<Integer> result = new ArrayList<>();
        int startRow = 0;
        int endRow = nums.length - 1;
        int startCol = 0;
        int endCol = nums[0].length - 1;

        while(startRow <= endRow && startCol <= endCol){
            for(int col = startCol; col <= endCol; col++){
                result.add(nums[startRow][col]);
            }
            startRow++;
            for(int row = startRow; row <= endRow; row++){
                result.add(nums[row][endCol]);
            }
            endCol--;
            for(int col = endCol;col >= startCol; col--){
                result.add(nums[endRow][col]);
            }
            endRow--;
            for(int row = endRow; row >= startRow; row--){
                result.add(nums[row][startCol]);
            }
            startCol++;
        }
        return result;
    }

    static void main() {
        int [][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        wavePrint(arr);
        System.out.println("");
        printArray(arr);
        System.out.println(" ");
        printArray(transpose(arr));
        System.out.println(" ");
        printArray(rotateArray(arr));
        System.out.println(" ");
        System.out.println(spiralPrint(arr));
    }
}
