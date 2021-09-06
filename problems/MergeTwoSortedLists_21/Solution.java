package problems.MergeTwoSortedLists_21;

public class Solution {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(1,
                new ListNode(2,
                        new ListNode(5)));

        ListNode head2 = new ListNode(0,
                new ListNode(2,
                        new ListNode(4)));

        ListNode newListNode = new Solution().mergeTwoLists(head1, head2);

        while (newListNode != null) {
            System.out.println(newListNode.val);
            newListNode = newListNode.next;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) return null;
        if (l2 == null) return l1;
        if (l1 == null) return l2;

        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }

        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
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
}