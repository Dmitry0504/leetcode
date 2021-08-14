package problems.PalindromeNumber_9;

class Solution {
    public boolean isPalindrome(int x) {
        try {
            return Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString()) == x;
        } catch (NumberFormatException ignored) {
            return false;
        }
    }
}
