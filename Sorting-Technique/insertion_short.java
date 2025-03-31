
public class insertion_short {

    static void insertionSort(int arr[], int n) {
    // Traverse through 1 to n
   
    for(int i=0; i<n; i++){
      // pick the current element
      int j = i;
      while (j > 0 && arr[j] < arr[j-1]){
        // swap arr[j] and arr[j-1]
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
        j--;  // decrement j to check the next element.
        
      }
    }
  }

  // Function to print an array
  
  static void printArray(int arr[], int n) {
    for (int i = 0; i < n; ++i)
      System.out.print(arr[i] + " ");
    System.out.println();
  }
 // main method to test the above functions
  // Time Complexity: O(n^2) in worst case and average case and best case is O(n) when the array is already sorted.
  // The best case occurs when the array is already sorted, and we only need to make n-1 comparisons.
  // Space Complexity: O(1)

  public static void main(String[] args) {
    int arr[] = { 12, 11, 13, 5, 6 };
    int n = arr.length;
    insertionSort(arr, n);
    printArray(arr, n);
  }

}

