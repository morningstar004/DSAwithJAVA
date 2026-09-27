package ArrayProblems;
import java.util.HashMap;

public  class Basic {
    public static float arrayAvg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++ ){
            sum = sum + arr[i];
        }
//      for(int i : arr){
//          sum += i;
//      }
        float avg = (float)sum/arr.length;
        return avg;
    }

    public static int[] multiBy10(int[] arr){
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i]*10;
        }
        return newArr;
    }

    public static int linerSearch(int[] arr, int num){
        for(int i= 0; i < arr.length ; i++){
            if(arr[i] == num){
                System.out.print("Index of the Number is :");
                return i;
            }
        }
        return -1;
    }

    public static int maxArray(int[] arr){
        int maxNum = 0;
        for (int j : arr) {
            if (j > maxNum) {
                maxNum = j;
            }
        }
        return maxNum;
    }
    public static int newMaxArray(int[] arr){
        int maxNum = 0;
        for (int j : arr) {
            maxNum = Math.max(maxNum,j);
        }
        return maxNum;
    }

    public static int  unsortedElement(int[] arr){
        for(int i : arr){
            if(arr[i] <= arr[i-1] ){
                return arr[i];
            }
        }
        return 0;
    }

    public static void reverseArray(int [] arr){
        int j = arr.length - 1;
        for(int i= 0; i <= j ; i++){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;
            j--;
        }
        System.out.print("{");
        for (int k : arr){
            System.out.print(k+",");
        }
        System.out.println("}");
    }

    public static void elementShift(int [] arr){
        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
        System.out.print("{");
        for(int z : arr){
            System.out.print(z+",");
        }
        System.out.println("}");
    }

//    public static void nElementShift(int [] arr, int n){
//        int last2 = arr[arr.length-1];
//
//        for (int i = arr.length - 1; i > 0; i--) {
//            arr[i] = arr[i - n];
//        }
//
//        arr[n] = last2;
//        System.out.print("{");
//        for(int z : arr){
//            System.out.print(z+",");
//        }
//        System.out.println("}");
//    }

    public static void alternateArray(int [] arr){
        int n = arr.length;
        int i = 0;
        int j = n-1;
        while(i <= j){
            if(i==j){
                System.out.println(arr[i]);
                return;
            }
            System.out.print(arr[i]+",");
            System.out.print(arr[j]+",");
            i++;
            j--;
        }
        System.out.println();
    }

    public static void frequencyCheck(int [] arr){
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        int maxFreq = -1;
        int maxFreqKey = -1;
        int minFreq = 999;
        int minFreqKey = 999;
        for(int key: freq.keySet()){
            if(freq.get(key) > maxFreq){
                maxFreq = freq.get(key);
                maxFreqKey = key;
            }
            if(freq.get(key) < minFreq){
                minFreq = freq.get(key);
                minFreqKey = key;
            }
        }
        System.out.println("Maximum Frequency is :- "+maxFreqKey);
        System.out.println("Minimum Frequency is :- "+minFreqKey);
    }

    public static void binaryReverseArray(int[] arr) {
        int j = arr.length - 1;

        for (int i = 0; i < j; i++) {
            arr[i] = arr[i] ^ arr[j];
            arr[j] = arr[i] ^ arr[j];
            arr[i] = arr[i] ^ arr[j];

            j--;
        }

        System.out.print("{");
        for (int k : arr) {
            System.out.print(k + ",");
        }
        System.out.println("}");
    }
    static void main() {
        int[] arr = {1,2,3,4,3,6,7,8,9,11};
        int[] brr = {2,4,2,5,1,4,4,4,4,4,12,4,5,2,1,4,3};
        System.out.println(arrayAvg(arr));

        int[] ans = multiBy10(arr);
        for(int i : ans){
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println(linerSearch(arr,15));
        System.out.println(maxArray(arr));
        System.out.println(newMaxArray(arr));
        System.out.println(unsortedElement(arr));
        reverseArray(arr);
        binaryReverseArray(arr);
        elementShift(arr);
//        nElementShift(arr,3);
        alternateArray(arr);
        frequencyCheck(brr);
    }
}
