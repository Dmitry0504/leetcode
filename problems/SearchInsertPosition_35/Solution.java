package problems.SearchInsertPosition_35;

public class Solution {
    public static void main(String[] args) {

        System.out.println(new Solution().searchInsert(new int[]{1, 2, 4, 5, 6}, 7));


    }

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = (high + low) / 2;
        while (low <= high) {
            mid = (high + low) / 2;

            if (target < nums[mid]) {
                high = mid - 1;
            } else if (target > nums[mid]) {
                low = mid + 1;
            } else return mid;
        }

        if (target > nums[mid]) return mid + 1;
        else return mid;
    }
}
