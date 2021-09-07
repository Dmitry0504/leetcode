package problems.MaximumSubarray_53;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 2, -1, 1, 2};
        System.out.println(new Solution().maxSubArray(arr));
    }

    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (currSum < 0) {
                currSum = nums[i];
                if (currSum > max)
                    max = currSum;
                continue;
            }

            currSum += nums[i];
            if (currSum > max)
                max = currSum;
        }
        return max;
    }
}
