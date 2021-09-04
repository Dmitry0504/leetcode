package problems.LongestPalindromicSubstring_5;

public class Solution {
    public static void main(String[] args) {
        String test = "cbbd";
        System.out.println(new Solution().longestPalindrome(test));
    }

    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        String result = String.valueOf(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {
            for(int j = s.length() - 1;j > i; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    String temp = s.substring(i, j + 1);
                    String temp2 = new StringBuilder(temp).reverse().toString();
                    if (temp.equalsIgnoreCase(temp2) && temp.length() > result.length()) {
                        result = temp;
                        if (result.length() > s.length()/2) return result;
                    }

                }
            }
        }
        return result;
    }
}
