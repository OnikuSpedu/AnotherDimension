/**
 * Tester
 */

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 6, 2, 3, 9};
        int[][] matrix0 = {
            {0, 1, 2, 3, 6, 2, 3, 9},
            {0, 1, 2, 3, 1, 3, 2, 0},
            {10, 23, 22, 5, 0, 0, 0, 0}
        };
        int[][] matrix1 = {
            {0, 1, 2, 3, 6, 2, 3, 0},
            {0, 1, 2, 3, 1, 3, 2, 5},
            {17, 0, 0, 0, 0, 0, 0, 0}
        };
        int[][] matrix2 = {
            {1, 1, 2},
            {2, 1, 2},
            {3, 4, 2}
        };
        int[][] matrix3 = {
            {2, 4, 2},
            {2, 2, 2},
        };
        System.out.println(ArrayOps.sum(arr1)); //26
        System.out.println(ArrayOps.largest(arr1)); //9
        System.out.println(Arrays.toString(ArrayOps.sumRows(matrix0))); // [26, 12, 60]
        System.out.println(Arrays.toString(ArrayOps.largestInRows(matrix0))); // [9, 3, 23]
        System.out.println(ArrayOps.sum(matrix0)); //98
        System.out.println(Arrays.toString(ArrayOps.sumCols(matrix0))); // [10, 25, 26, 11, 7, 5, 5, 9]
        System.out.println(ArrayOps.isRowMagic(matrix0)); //false
        System.out.println(ArrayOps.isRowMagic(matrix1)); //true
        System.out.println(ArrayOps.isRowMagic(matrix2)); //false
        System.out.println(ArrayOps.isColMagic(matrix0)); //false
        System.out.println(ArrayOps.isColMagic(matrix1)); //false
        System.out.println(ArrayOps.isColMagic(matrix2)); //true
        System.out.println(ArrayOps.isLocationMagic(matrix0, 1, 1));
        System.out.println(ArrayOps.isLocationMagic(matrix1, 1, 3));
        System.out.println(ArrayOps.isLocationMagic(matrix2, 2, 3));
        System.out.println(ArrayOps.isLocationMagic(matrix3, 0, 1));
        System.out.println(ArrayOps.isLocationMagic(matrix3, 1, 1));
    }   
}