public class bubble_sort {
  // This is a Java program to demonstrate bubble sort
  // Time Complexity: O(n^2) in worst case and average case
  // Space Complexity: O(1)
  void bubbleSort(int arr[], int n){
    // Traverse through all array elements
    for(int i = n-1; i>=0; i--){
      // Traverse the array from 0 to i-1
      for(int j = 0; j<i-1 ; j++){
        // Swap if the element found is greater than the next element
        if(arr[j] > arr[j+1]){
          // swap arr[j] and arr[j+1]
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
  // Function to print an array
  void printArray(int arr[], int n){
    for(int i = 0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
    int n = arr.length;
    bubble_sort obj = new bubble_sort();
    obj.bubbleSort(arr, n);
    System.out.println("Sorted array: ");
    obj.printArray(arr,n);
  }
  
}
