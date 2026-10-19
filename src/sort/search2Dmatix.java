package sort;

public class search2Dmatix {
    public static int[] searchMatrix(int[][] matrix, int target){
        int rowCount = matrix.length;
        int colCount = matrix[0].length;
        int n = rowCount * colCount;

        int s = 0;
        int e = n - 1;

        while(s <= e){
            int mid = s + (e - s)/2;
            int row = mid/colCount;
            int col = mid%colCount;
            if(matrix[row][col] == target){
                int[] index = {row,col};
                return index;
            }else if(matrix[row][col] < target){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return null;
    }
    public static void printArray(int[] nums){
        for (int num : nums) {
            System.out.println(
                    num
            );
        }

    }

    public static int[] searchAnotherMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 ||
                matrix[0].length == 0) {
            return null;
        }

        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }
        return null;
    }

    static void main() {
        int[][] arr = {{1,2,3,5},{10,11,16,20},{23,30,34,60}};

        int[][] newArray = {{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}};

        printArray(searchMatrix(arr,60));
        printArray(searchAnotherMatrix(newArray, 12));
    }
}
