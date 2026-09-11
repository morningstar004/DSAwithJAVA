package Array;

import org.w3c.dom.ls.LSOutput;

public class _2D_Array {
    static void main(){
        //declaration
        int [][] matrix;

        //initialization
        int newMatrix [][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int rowlen = newMatrix.length;
        int collen = newMatrix[0].length;
        // Accessing values
        //System.out.print(newMatrix[2][1]);

        for (int a = 0 ; a < rowlen ; a++){
            for( int b = 0 ; b < collen ; b++){
                System.out.print(newMatrix[a][b] + " ");
            }
            System.out.println();
        }

    }
}
