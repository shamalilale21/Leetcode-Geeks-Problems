package Java;

import java.util.HashSet;

public class longestSubstringWithoutRepeatingChar {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		int longest = sol.lengthOfLongestSubstring("abcabcbb");
		System.out.println(longest);
	}

}

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int longest = 0;
        

        for (int right = 0; right < s.length(); right++) {
            // If the character at 'right' index is already in the set, 
            // we remove characters starting from 'left' until it is no longer in the set
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;  // Move the left pointer to shrink the window
            }

            // Add the current character at 'right' to the set
            set.add(s.charAt(right));

            // Update the length of the longest substring
            longest = Math.max(longest, right - left + 1);
        }
        
        
        return longest;
    }
}
