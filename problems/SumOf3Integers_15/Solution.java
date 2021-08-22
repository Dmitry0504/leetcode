package problems.SumOf3Integers_15;

import problems.Solution1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().threeSum(new int[]{-1, 1, 0, 2, -3}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        long start = System.currentTimeMillis();
        Arrays.sort(nums);
        List<List<Integer>> integers = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (-x == nums[left] + nums[right]) {
                    ArrayList<Integer> list = new ArrayList<>(List.of(x, nums[left], nums[right]));
                    Collections.sort(list);
                    if (!integers.contains(list))integers.add(list);
                    left++;
                }
                else if (-x > nums[left] + nums[right]) {
                    left++;
                }
                else if (-x < nums[left] + nums[right]) {
                    right--;
                }
            }
        }
        System.out.println(System.currentTimeMillis() - start);
        return integers;
    }
}
