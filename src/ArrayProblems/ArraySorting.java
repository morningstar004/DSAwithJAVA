package ArrayProblems;
public class ArraySorting {
    public static int[] sort(int [] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] == 1 && arr[j] == 0){
                arr[i] = 0;
                arr[j] = 1;
            }
            if(arr[i] == 0){
                i++;
            }
            if(arr[j] == 1){
                j--;
            }
        }
        return arr;
    }
    static void main() {
        int [] arr = {1,0,1,0,1,0,1,1,1,0,0,0,1,0,1};
        int[] brr = sort(arr);
        System.out.print("{");
        for (int value : brr) {
            System.out.print(value + ",");
        }
        System.out.println("}");
    }
}
