package problems.ReverseLinkedList_206;

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4))));

        System.out.println(head);

        System.out.println(new Solution().reverseList(head));
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode currNode = head;

        while (currNode != null) {
            ListNode next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }

        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
