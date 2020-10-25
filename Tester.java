/**
 * Tester
 */

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 6, 2, 3, 9};
        int[][] matrix = {
            {0, 1, 2, 3, 6, 2, 3, 9},
            {0, 1, 2, 3, 1, 3, 2, 0},
            {10, 23, 22, 5, 0, 0, 0, 0}
        };
        System.out.println(ArrayOps.sum(arr1));
        System.out.println(ArrayOps.largest(arr1));
        System.out.println(Arrays.toString(ArrayOps.sumRows(matrix)));
        System.out.println(Arrays.toString(ArrayOps.largestInRows(matrix)));
        System.out.println(ArrayOps.sum(matrix));
        System.out.println(Arrays.toString(ArrayOps.sumCols(matrix)));
    }   
}