"You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.
 

Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 105"


class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > maxReach) {
                return false; // If we can't reach this index, return false
            }
            maxReach = Math.max(maxReach, i + nums[i]); // Update the maximum reachable index

            if (maxReach >= nums.length - 1) { // If we can reach or exceed the last index,
                return true;
            }
        }
        return false; // If we cannot reach the end, return false
    }
}


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {2, 3, 1, 1, 4};
        int[] nums2 = {3, 2, 1, 0, 4};

        System.out.println(solution.canJump(nums1)); // Output: true
        System.out.println(solution.canJump(nums2)); // Output: false
    }
}


// Time Complexity: O(n), where n is the length of the input array nums. We traverse the array once.
// Space Complexity: O(1), as we are using only a constant amount of extra space to store the maximum reachable index.
