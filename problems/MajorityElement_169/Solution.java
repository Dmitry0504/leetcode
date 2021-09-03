package problems.MajorityElement_169;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 2, 1, 2, 2, 4, 2, 2, 2, 5};
        System.out.println(new Solution().majorityElement(array));
    }

    public int majorityElement(int[] nums) {
        int element = 0;
        int count = 0;

        for(int i: nums) {
            if (count == 0)
                element = i;

            if (i == element)
                count++;

            else
                count--;
        }
        return element;
    }
}
