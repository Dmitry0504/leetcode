package problems.RemoveElement_27;

public class Solution {

    public static void main(String[] args) {
        int[] array = {};

        System.out.println(new Solution().removeElement(array, 1));

    }

    public int removeElement(int[] nums, int val) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }

        return index;
    }
}
