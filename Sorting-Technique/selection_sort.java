public class selection_sort {
  
  void selectionSort(int arr[], int n){
    // iterate through the array.
    // n-1 times because the last element will be in place after n-1 iterations.
    for(int i = 0; i < n-1; i++){
      // find the minimum element in unsorted array.
      // assume the first element of the unsorted array is the minimum element.
      int min_idx = i;
      for(int j = i+1; j< n; j++){
        // check condition if arr[j] < arr[min_idx] --> update min_idx if true.
        if(arr[j] < arr[min_idx]){
          min_idx = j;
        }
        // swap the found minimum element with the first element of the unsorted array.
        // swap arr[i] and arr[min_idx]

        //swapping technique
        int temp = arr[min_idx];
        arr[min_idx] = arr[i];
        arr[i] = temp;
      }
    }
  }
  void printArray(int arr[], int n){
    // print the sorted array.
    System.out.println("Sorted array: ");
    for(int i = 0; i < n; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  

  public static void main(String[] args){
    
    int arr[] = {64, 25, 12, 22, 11};
    int n = arr.length;
    // create an object of selection_sort class.
    selection_sort obj = new selection_sort();
    // call the selectionSort method to sort the array.
    obj.selectionSort(arr, n);
    // call the printArray method to print the sorted array.
    obj.printArray(arr, n);
  }
  
}
