package problems;

import java.util.Arrays;

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
        System.out.println(new Solution1().searchInsert(new int[]{1, 2, 4, 5, 6}, 7));


    }

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = (high + low) / 2;
        while (low <= high) {
            mid = (high + low) / 2;

            if (target < nums[mid]) {
                high = mid - 1;
            }
            else if (target > nums[mid]) {
                low = mid + 1;
            }
            else return mid;
        }

        if(target > nums[mid]) return mid + 1;
        else return mid;

    }



}
