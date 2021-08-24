package problems.Sqrt_x_69;

public class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().mySqrt(2));
    }

    public int mySqrt(int x) {
        if (x < 2) return x;
        if (x == 2) return 1;
        int i = 1;

        while (i < 46341) {
            long res = i * i;
            if (res < x) {
                i++;
            }
            else if (res > x) {
                return i - 1;
            }
            else return i;
        }
        return i-1;
    }
}
