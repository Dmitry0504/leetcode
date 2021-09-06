package problems.RomanToInteger_13;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("LVIII"));
    }

    public int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int sum = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int current = values.get(s.charAt(i));
            if (current >= prev) {
                sum += current;
            } else {
                sum -= current;
            }
            prev = current;
        }
        return sum;
    }
}
