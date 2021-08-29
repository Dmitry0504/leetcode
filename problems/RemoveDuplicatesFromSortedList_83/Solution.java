package problems.RemoveDuplicatesFromSortedList_83;

public class Solution {
    public static void main(String[] args) {
        ListNode first = new ListNode(1,
                new ListNode(1,
                        new ListNode(2,
                                new ListNode(3,
                                        new ListNode(3)))));

        ListNode newFirst = new Solution().deleteDuplicates(first);
        while (newFirst != null) {
            System.out.println(newFirst);
            newFirst = newFirst.next;
        }

    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode currentNode = head;
        ListNode newFirst = currentNode;
        while (currentNode.next != null) {
            if (currentNode.val == currentNode.next.val) {
                if(currentNode.next.next != null)
                    currentNode.next = currentNode.next.next;
                else {
                    currentNode.next = null;
                    break;
                }
            }
            else
                currentNode = currentNode.next;
        }
        return newFirst;
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
                "val=" + val + "}";
    }
}