package problems.PlusOne_66;

import java.math.BigDecimal;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().plusOne(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 1, 1, 1, 9, 1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 9})));
    }

    public int[] plusOne(int[] digits) {
        StringBuilder builder = new StringBuilder();
        for(int i: digits) {
            builder.append(i);
        }
        BigDecimal bigDecimal = new BigDecimal(builder.toString());
        bigDecimal =  bigDecimal.add(new BigDecimal("1"));
        String resString = String.valueOf(bigDecimal);
        int[] result = new int[resString.length()];
        int i = 0;
        for(char c: resString.toCharArray()) {
            result[i++] = Integer.parseInt(String.valueOf(c));
        }

        return result;
    }
}
