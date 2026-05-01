"Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 

Example 1:

Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.
Example 2:

Input: target = 4, nums = [1,4,4]
Output: 1
Example 3:

Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 

Constraints:

1 <= target <= 109
1 <= nums.length <= 105
1 <= nums[i] <= 104
 

Follow up: If you have figured out the O(n) solution, try coding another solution of which the time complexity is O(n log(n))."

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;

        while(left<right){
            int w = right - left;
            int l = Math.min(height[left], height[right]);
            int area = w*l;

            maxWater = Math.max(maxWater, area);
            if(height[left] < height[right]){
                left++;
            }else{
                right --;
            }
        }
        return maxWater;
    }
}

// call the function with the input array

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(height);
        System.out.println("Maximum water that can be contained: " + result);
    }
}