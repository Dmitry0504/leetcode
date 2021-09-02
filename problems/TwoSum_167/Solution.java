package problems.TwoSum_167;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(new Solution().twoSum(arr, 6)));
    }

    public int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            int x = target - numbers[i];
            int indexX = Arrays.binarySearch(numbers, x);
            if (indexX > 0 && indexX != i){
                return i < indexX ? new int[]{i + 1, indexX + 1} : new int[]{indexX + 1, i + 1};
            }
        }
        return null;
    }
}
