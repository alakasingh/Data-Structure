"Implement the RandomizedSet class:

RandomizedSet() Initializes the RandomizedSet object.
bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
You must implement the functions of the class such that each function works in average O(1) time complexity.

 

Example 1:

Input
["RandomizedSet", "insert", "remove", "insert", "getRandom", "remove", "insert", "getRandom"]
[[], [1], [2], [2], [], [1], [2], []]
Output
[null, true, false, true, 2, true, false, 2]

Explanation
RandomizedSet randomizedSet = new RandomizedSet();
randomizedSet.insert(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
randomizedSet.remove(2); // Returns false as 2 does not exist in the set.
randomizedSet.insert(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
randomizedSet.getRandom(); // getRandom() should return either 1 or 2 randomly.
randomizedSet.remove(1); // Removes 1 from the set, returns true. Set now contains [2].
randomizedSet.insert(2); // 2 was already in the set, so return false.
randomizedSet.getRandom(); // Since 2 is the only number in the set, getRandom() will always return 2.
 

Constraints:

-231 <= val <= 231 - 1
At most 2 * 105 calls will be made to insert, remove, and getRandom.
There will be at least one element in the data structure when getRandom is called."

import java.util.*;

class RandomizedSet {
    private Map<Integer, Integer> map; // Map to store value and its index in the list
    private List<Integer> list; // List to store the values for getRandom

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false; // Value already exists, return false
        }
        map.put(val, list.size()); // Add value and its index to the map
        list.add(val); // Add value to the list
        return true; // Value inserted successfully
    }
    
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false; // Value does not exist, return false
        }
        int index = map.get(val); // Get index of the value to remove
        int lastElement = list.get(list.size() - 1); // Get the last element in the list
        
        // Move the last element to the index of the element to remove
        list.set(index, lastElement);
        map.put(lastElement, index); // Update the index of the last element in the map
        
        list.remove(list.size() - 1); // Remove the last element from the list
        map.remove(val); // Remove the value from the map
        return true; // Value removed successfully
    }
    
    public int getRandom() {
        int randomIndex = new Random().nextInt(list.size()); // Generate a random index
        return list.get(randomIndex); // Return the value at the random index
    }