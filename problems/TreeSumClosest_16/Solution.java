package problems.TreeSumClosest_16;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().threeSumClosest(new int[]{0, 1, 4, 0, 5}, 2));
    }

    public int threeSumClosest(int[] nums, int target) {
        int res = Integer.MIN_VALUE;
        int n = nums.length - 1;
        Arrays.sort(nums);
        for(int i = 0; i < n - 1; i++){
            int left = i + 1;
            int right = n;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == target){
                    return target;
                }else{
                    if(res == Integer.MIN_VALUE || Math.abs(sum - target) < Math.abs(res - target)){
                        res = sum;
                    }
                }

                if(sum > target){
                    right--;
                }else{
                    left++;
                }
            }
        }

        return res;
    }
}
