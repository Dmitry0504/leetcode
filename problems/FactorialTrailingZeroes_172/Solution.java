package problems.FactorialTrailingZeroes_172;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        System.out.println(fact(55));
        System.out.println(new Solution().trailingZeroes(55));
    }

    public int trailingZeroes(int n) {
        int n5 = 0, temp = 5;
        while (temp <= n) {
            n5 += n / temp;
            temp *= 5;
        }
        return n5;
    }

    public static BigInteger fact(int n) {
        BigInteger res = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= n; i++) {
            res = res.multiply(new BigInteger(String.valueOf(i)));
        }
        return res;
    }
}
