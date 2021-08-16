package problems.RemoveNthNodeFromEndOfList_19;

public class Solution {

    public static void main(String[] args) {
        ListNode first = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4))));

//        ListNode listNode = new ListNode();
//        new Solution1().removeNthFromEnd(listNode, 1);

        ListNode node = new Solution().removeNthFromEnd(first, 4);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int currIndex = 1;
        int size = 0;
        ListNode currentNode = head;
        ListNode newHead = currentNode;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            size++;
        }

        int indexElementForDelete = size - n + 1;

        if(indexElementForDelete == 1) {
            return head.next;
        }
        while (currIndex < indexElementForDelete) {

            if(currIndex == indexElementForDelete - 1) {
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
            currIndex++;
        }
        return newHead;

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
