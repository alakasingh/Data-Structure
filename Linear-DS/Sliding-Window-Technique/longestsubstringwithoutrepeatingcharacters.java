"Given a string s, find the length of the longest substring without duplicate characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces."

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int low = 0;
        int n = s.length();
        int max_len = 0;

        for(int high = 0 ; high< n ; high++){

            char currChar = s.charAt(high);
            // if the charcter already in map, move the low pointer
            if(map.containsKey(currChar)){
                // move low pointer to the high of the prev occurance
                low = Math.max(low, map.get(currChar)+1);
            }

            //update the map with current charcter and index
            map.put(currChar, high);
            //calculate window and update the max_len
            max_len = Math.max(max_len, high-low+1);
            
        }
        return max_len;
        
        
    }
}

// call the function

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);
    }
}