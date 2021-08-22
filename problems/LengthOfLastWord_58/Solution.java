package problems.LengthOfLastWord_58;

import problems.Solution1;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord(""));
    }

    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();
    }
}
