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

    public static int maxm1(int[][] arr){
        int totalRow = arr.length;
        int totalColumn = arr[0].length;
        int maxOnes = 0;
        int target = 1;
        for(int rowIndex = 0;rowIndex < totalRow; rowIndex++){
            int s = 0;
            int e = totalColumn - 1;
            int firstOne = totalColumn;

            while (s <= e) {
                int mid = s + (e - s) / 2;

                if (arr[rowIndex][mid] == 1) {
                    firstOne = mid;
                    e = mid - 1;
                } else {
                    s = mid + 1;
                }
            }
            int ones = totalColumn - firstOne;
            maxOnes = Math.max(maxOnes, ones);
        }
        return maxOnes;
    }

    public static int SearchInInfinitArray(int[] inf, int target){
        if (inf == null || inf.length == 0) {
            return -1;
        }
        if(inf[0] == target){
            return 0;
        }
        int start;
        int end;
        for(int i = 1; i < inf[target]; i=i*2){
            if(inf[i] == target){
                return i;
            } else if (inf[i]>target) {
                start = i/2;
                end = i;
                while(start <= end){
                    int mid = start + (end - start)/2;
                    if (inf[mid] == target) {
                        return mid;
                    } else if (inf[mid] <= target){
                        start = mid + 1;
                    }else{
                        end = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
    static void main() {
        int[][] arr = {{1,2,3,5},{10,11,16,20},{23,30,34,60}};
        int[][] newArray = {{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}};
        int[][] BineryArray = {{0,0,0,1},{0,0,1,1},{0,1,1,1},{1,1,1,1}};

//        printArray(searchMatrix(arr,60));
//        printArray(searchAnotherMatrix(newArray, 12));
        System.out.println(maxm1(BineryArray));
    }
}
