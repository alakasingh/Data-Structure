// ============================================================
//  Arrays in Java
//  Fixed size; declared with type and length
// ============================================================

public class ArrayExamples {
    public static void main(String[] args) {

        // ------ 1. Declaration ------
        int[] arr = {2, 21, 22, 33, 44, 20};   // integer array, size 6

        // alternative: declare size first, fill later
        int[] arr2 = new int[6];
        arr2[0] = 2;
        arr2[1] = 21;

        // ------ 2. Access by index (O(1)) ------
        System.out.println(arr[0]);             // → 2
        System.out.println(arr[5]);             // → 20

        // ------ 3. Modify by index (O(1)) ------
        arr[3] = 99;
        System.out.println(arr[3]);             // → 99

        // ------ 4. Traverse ------
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        // enhanced for-loop (no index needed)
        for (int val : arr) {
            System.out.println(val);
        }

        // ------ 5. Common operations ------
        System.out.println(arr.length);         // size → 6

        // sort the array in-place
        java.util.Arrays.sort(arr);
        System.out.println(java.util.Arrays.toString(arr));  // → [2, 20, 21, 22, 44, 99]

        // copy to a new array
        int[] copy = java.util.Arrays.copyOf(arr, arr.length);

        // ------ 6. 2D array (matrix) ------
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(matrix[1][2]);       // → 6  (row 1, col 2)
    }
}
