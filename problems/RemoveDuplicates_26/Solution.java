package problems.RemoveDuplicates_26;

class Solution {
    public int removeDuplicates(int[] nums) {
        int lastIndex = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[lastIndex]) continue;
            nums[++lastIndex] = nums[i];
        }
        return nums.length > 0 ? lastIndex + 1 : 0;
    }
}
