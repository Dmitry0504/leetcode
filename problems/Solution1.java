package problems;

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
        System.out.println(new Solution1().strStr("", ""));


    }

    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }


}
