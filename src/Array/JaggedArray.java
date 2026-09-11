package Array;

public class JaggedArray {

    public static void main(String[] args) {

        // Size of each row
        int[] sizes = {2, 5, 3, 1};

        // Create a jagged 2D array
        int[][] arr = new int[sizes.length][];

        // Create each row according to its required size
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[sizes[i]];
        }

        // Fill the array with values from 1 to 11
        int value = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = value;
                value++;
            }
        }

        // Print the array
        System.out.println("Your Array is:");

        for (int i = 0; i < arr.length; i++) {

            System.out.print("{");

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j]);

                if (j < arr[i].length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println("}");
        }
    }
}
