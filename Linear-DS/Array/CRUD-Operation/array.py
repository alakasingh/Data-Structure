# ============================================================
#  Arrays in Python
#  Python uses 'list' as its built-in dynamic array
# ============================================================

# ------ 1. Declaration ------
arr = [2, 21, 22, 33, 44, 20]   # integer array, size 6

# ------ 2. Access by index (O(1)) ------
print(arr[0])   # → 2   (first element)
print(arr[5])   # → 20  (last element)
print(arr[-1])  # → 20  (Python shortcut: last element)

# ------ 3. Modify by index (O(1)) ------
arr[3] = 99
print(arr)      # → [2, 21, 22, 99, 44, 20]

# ------ 4. Traverse ------
for element in arr:
    print(element)

# index + value together
for i, val in enumerate(arr):
    print(f"arr[{i}] = {val}")

# ------ 5. Common operations ------
print(len(arr))         # size  → 6
print(arr[1:4])         # slice → [21, 22, 99]
arr.append(77)          # add at end   (dynamic — Python specific)
arr.pop()               # remove last  (dynamic — Python specific)

# ------ 6. 2D array (matrix) ------
matrix = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
print(matrix[1][2])     # → 6  (row 1, col 2)
