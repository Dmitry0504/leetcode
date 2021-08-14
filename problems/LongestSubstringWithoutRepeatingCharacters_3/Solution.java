package problems.LongestSubstringWithoutRepeatingCharacters_3;

import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        int i = 0, j = 0, max = 0;

        HashSet<Character> characters = new HashSet<>();

        while (i < s.length() && j < s.length()) {
            if(characters.contains(s.charAt(j))) {
                characters.remove(s.charAt(i));
                i++;
            }
            else {
                characters.add(s.charAt(j));
                j++;
                max = Math.max(j - i, max);
            }
        }

        return max;
    }
}
