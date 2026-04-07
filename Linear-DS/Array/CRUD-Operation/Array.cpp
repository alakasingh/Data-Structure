// ============================================================
//  Arrays in C++
//  Raw arrays are fixed-size; std::vector is the dynamic version
// ============================================================

#include <iostream>
#include <vector>
#include <algorithm>    // for sort()
using namespace std;

int main() {

    // ------ 1. Declaration ------
    int arr[] = {2, 21, 22, 33, 44, 20};   // raw array, size 6
    int size   = sizeof(arr) / sizeof(arr[0]);  // calculate size at runtime

    // ------ 2. Access by index (O(1)) ------
    cout << arr[0] << endl;     // → 2
    cout << arr[5] << endl;     // → 20

    // ------ 3. Modify by index (O(1)) ------
    arr[3] = 99;
    cout << arr[3] << endl;     // → 99

    // ------ 4. Traverse ------
    for (int i = 0; i < size; i++) {
        cout << "arr[" << i << "] = " << arr[i] << endl;
    }

    // range-based for loop (C++11+)
    for (int val : arr) {
        cout << val << " ";
    }
    cout << endl;

    // ------ 5. Sort (in-place) ------
    sort(arr, arr + size);      // ascending order

    // ------ 6. std::vector — dynamic array (recommended) ------
    vector<int> vec = {2, 21, 22, 33, 44, 20};

    vec.push_back(77);          // add at end
    vec.pop_back();             // remove last
    cout << vec.size() << endl; // → 6

    // access same as raw array
    cout << vec[0] << endl;     // → 2

    // ------ 7. 2D array (matrix) ------
    int matrix[3][3] = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    cout << matrix[1][2] << endl;   // → 6  (row 1, col 2)

    return 0;
}
