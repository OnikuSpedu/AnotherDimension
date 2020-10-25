public class ArrayOps {
    public static void main(String[] args) {
        
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static int largest(int[]arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
    public static int[] sumRows(int[][] matrix) {
        int[] sums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            sums[i] = sum(matrix[i]);
        }
        return sums;
    }
    public static int[] largestInRows(int[][] matrix) {
        int[] largests = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            largests[i] = largest(matrix[i]);
        }
        return largests;
    }
    public static int sum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    public static int[] sumCols(int[][] matrix) {
        int[] sums = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            int tempSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                tempSum += matrix[j][i];
            }
            sums[i] = tempSum;
        }
        return sums;
    }
}