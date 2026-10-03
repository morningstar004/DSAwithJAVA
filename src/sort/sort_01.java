package sort;
public class sort_01 {
    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n ; i++){
            int min = 0;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min]){
                    int temp;
                    temp = arr[min];
                    arr[min] = arr[j];
                    arr[min] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int current = i;
            int previous = i -1;
            int currentValue = arr[current];
            while(previous >= 0 && arr[previous] > currentValue){
                arr[previous + 1] = arr[previous];
                previous--;
                arr[previous + 1] = arr[current];
            }
        }
        return arr;
    }

    public static void printArr(int[] arr){
        for (int j : arr) {
            System.out.print(j);
        }
    }
    static void main() {
        int[] nums = {5,8,9,4,1,2,6,7};

        printArr(bubbleSort(nums));
        System.out.println();
        printArr(selectionSort(nums));
        System.out.println();
        printArr(insertionSort(nums));
    }
}
