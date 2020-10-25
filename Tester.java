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
        System.out.println("Sum (26 Expected):");
        System.out.println(ArrayOps.sum(arr1)); //26
        System.out.println("Largest (9 Expected):");
        System.out.println(ArrayOps.largest(arr1)); //9
        System.out.println("sumRows ([26, 12, 60] Expected):");
        System.out.println(Arrays.toString(ArrayOps.sumRows(matrix0))); // [26, 12, 60]
        System.out.println("largestInRows ([9, 3, 23] Expected):");
        System.out.println(Arrays.toString(ArrayOps.largestInRows(matrix0))); // [9, 3, 23]
        System.out.println("Sum (98 Expected):");
        System.out.println(ArrayOps.sum(matrix0)); //98
        System.out.println("sumCols ([10, 25, 26, 11, 7, 5, 5, 9] Expected):");
        System.out.println(Arrays.toString(ArrayOps.sumCols(matrix0))); // [10, 25, 26, 11, 7, 5, 5, 9]
        System.out.println("isRowMagic (false Expected):");
        System.out.println(ArrayOps.isRowMagic(matrix0)); //false
        System.out.println("isRowMagic (true Expected):");
        System.out.println(ArrayOps.isRowMagic(matrix1)); //true
        System.out.println("isRowMagic (false Expected):");
        System.out.println(ArrayOps.isRowMagic(matrix2)); //false
        System.out.println("isColMagic (false Expected):");
        System.out.println(ArrayOps.isColMagic(matrix0)); //false
        System.out.println("isColMagic (false Expected):");
        System.out.println(ArrayOps.isColMagic(matrix1)); //false
        System.out.println("isColMagic (true Expected):");
        System.out.println(ArrayOps.isColMagic(matrix2)); //true
        System.out.println("isLocationMagic (false Expected):");
        System.out.println(ArrayOps.isLocationMagic(matrix0, 1, 1)); //false
        System.out.println("isLocationMagic (false Expected):");
        System.out.println(ArrayOps.isLocationMagic(matrix1, 1, 2)); //false
        System.out.println("isLocationMagic (false Expected):");
        System.out.println(ArrayOps.isLocationMagic(matrix2, 2, 2)); //false
        System.out.println("isLocationMagic (false Expected):");
        System.out.println(ArrayOps.isLocationMagic(matrix3, 0, 1)); //false
        System.out.println("isLocationMagic (true Expected):");
        System.out.println(ArrayOps.isLocationMagic(matrix3, 1, 1)); //true
    }   
}