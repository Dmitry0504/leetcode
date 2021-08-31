package problems.SingleNumber_136;

import java.util.HashSet;

public class Solution {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 1};

        System.out.println(new Solution().singleNumber(array));
    }

    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i: nums) {
            if (!set.add(i)) {
                set.remove(i);
            }
        }

        return set.iterator().next();
    }
}
