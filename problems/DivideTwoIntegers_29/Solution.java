package problems.DivideTwoIntegers_29;

import problems.Solution1;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution1().divide(Integer.MIN_VALUE, 1));
    }

    public int divide(int dividend, int divisor) {
        if (divisor == 0) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int result = 0;

        while (a >= b) {
            int numShift = 0;
            while(a >= (b << numShift)){
                numShift++;
            }

            result += 1 << (numShift-1);
            a -= (b << (numShift-1));
        }
        if(dividend > 0 && divisor > 0 || dividend < 0 && divisor < 0) return result;
        else return -result;
    }
}
