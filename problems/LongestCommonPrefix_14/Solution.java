package problems.LongestCommonPrefix_14;

public class Solution {
    public static void main(String[] args) {
        String[] arr = {"aa"};
        System.out.println(new Solution().longestCommonPrefix(arr));

    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        int i;
        char ch;
        if(strs[0].isEmpty()) return "";
        for (i = 0; i < strs[0].length(); i++) {
            ch = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if(strs[j].length() - 1 < i || strs[j].charAt(i) != ch) return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
