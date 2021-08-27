package problems.AddBinary_67;


import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
        ));
    }

    public String addBinary(String a, String b) {
        BigInteger first = new BigInteger(a, 2);
        BigInteger second = new BigInteger(b, 2);
        return first.add(second).toString(2);
    }
}
