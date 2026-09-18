package ArrayProblems;
public  class Basic {
    public static float arrayAvg(int arr[]){
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

    public static int[] multiBy10(int arr[]){
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i]*10;
        }
        return newArr;
    }

    public static int linerSearch(int arr[], int num){
        for(int i= 0; i < arr.length ; i++){
            if(arr[i] == num){
                System.out.print("Index of the Number is :");
                return i;
            }
        }
        return -1;
    }
    static void main() {
        int arr[] = {1,2,3,4,5,6,7,8,9,11};
        System.out.println(arrayAvg(arr));

        int ans[] = multiBy10(arr);
        for(int i : ans){
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println(linerSearch(arr,15));
    }
}
