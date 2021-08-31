package problems.ValidPalindrome_125;

public class Solution {

    public static void main(String[] args) {
        String test = "a,b _a";

        System.out.println(new Solution().isPalindrome(test));
    }

    public boolean isPalindrome(String s) {
        String temp = s.replaceAll("[^A-Za-z|0-9]", "");
        return new StringBuilder(temp).reverse().toString().equalsIgnoreCase(temp);
    }
}
