package problems.IntegerToRoman_12;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().intToRoman(12));
    }

    public String intToRoman(int num) {
        int[] nums = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] romen = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder sb = new StringBuilder();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (num >= nums[i]) {
                sb.append(romen[i]);
                num -= nums[i];
            }
            if (num == 0) break;
        }
        return sb.toString();
    }
}
