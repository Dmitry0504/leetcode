package problems.MergeSortedArray_88;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] firstArray = {1, 4, 0, 0};
        int[] secondArray = {2, 7};

        new Solution().merge(firstArray, 2, secondArray, 2);
        System.out.println(Arrays.toString(firstArray));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m++] = nums2[i];
        }
        Arrays.sort(nums1);

    }
}
