package Two_D_Array_Problems;
import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.ArrayList;
import java.util.List;

public class sums {
    public static List<Integer> rowSum (int [][] nums){
        List<Integer> result = new ArrayList<>();
        int rowLength = nums.length;
        int colLength = nums[0].length;
        for(int row = 0;row < rowLength; row++){
            int sum = 0;
            for(int col = 0;col < colLength; col++){
                sum = sum + nums[row][col];
            }
            result.add(sum);
        }
        return result;
    }

    public static List<Integer> colSum (int [][] nums){
        List<Integer> result = new ArrayList<>();
        int rowLength = nums.length;
        int colLength = nums[0].length;
        for(int col = 0; col < colLength; col++){
            int sum = 0;
            for(int row = 0; row < rowLength; row++){
                sum = sum + nums[row][col];
            }
            result.add(sum);
        }
        return result;
    }

    static void main() {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(rowSum(arr));
        System.out.println(colSum(arr));
    }
}
