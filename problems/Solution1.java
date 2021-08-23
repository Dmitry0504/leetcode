package problems;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution1 {

    public static void main(String[] args) {
//        ListNode first = new ListNode(1,
//                new ListNode(2,
//                        new ListNode(3,
//                                new ListNode(4))));
//
//        ListNode listNode = new ListNode();
//        new Solution1().removeNthFromEnd(listNode, 1);

//        ListNode node = new Solution1().removeNthFromEnd(first, 4);
//        while (node != null) {
//            System.out.println(node.val);
//            node = node.next;
//        }
  //      System.out.println(new Solution1().threeSumClosest(new int[]{5, 0, 0, 3}, 1));
        System.out.println(Arrays.toString(new Solution1().plusOne(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 1, 1, 1, 9, 1, 1, 1, 1, 1, 1, 1,1, 1, 1, 1, 1, 1, 9})));

    }

    public int threeSumClosest(int[] nums, int target) {
        //long start = System.currentTimeMillis();
        int sum = 0;
        int sumPrev = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (target == x + nums[left] + nums[right]) {
                    return x + nums[left] + nums[right];
                }
                else if (target > x + nums[left] + nums[right]) {
                    left++;

                }
                else if (target < x + nums[left] + nums[right]) {
                    right--;
                }
                sum = x + nums[left] + nums[right];
            }
            sumPrev = Math.abs(target - sumPrev) > Math.abs(target - sum) ? sum : sumPrev;
        }
        //System.out.println(System.currentTimeMillis() - start);
        return sumPrev;
    }


    public int[] plusOne(int[] digits) {
        StringBuilder builder = new StringBuilder();
        for(int i: digits) {
            builder.append(i);
        }
        BigDecimal bigDecimal = new BigDecimal(builder.toString());
        bigDecimal =  bigDecimal.add(new BigDecimal("1"));
        String resString = String.valueOf(bigDecimal);
        int[] result = new int[resString.length()];
        int i = 0;
        for(char c: resString.toCharArray()) {
            result[i++] = Integer.parseInt(String.valueOf(c));
        }

        return result;
    }
}
