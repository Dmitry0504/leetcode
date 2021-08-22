package problems;

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
        System.out.println(new Solution1().threeSum(new int[]{-1, 1, 0, 2, -3}));


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
