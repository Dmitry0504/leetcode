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
        System.out.println(new Solution1().lengthOfLastWord(""));


    }

    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();
    }



}
