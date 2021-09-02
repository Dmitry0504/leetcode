package problems.LinkedListCycle_141;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode sec = new ListNode(2);
        head.next = sec;
        ListNode third = new ListNode(3);
        sec.next = third;
        ListNode fourth = new ListNode(4);
        third.next = fourth;
        //fourth.next = sec;

        System.out.println(new Solution().hasCycle(head));
    }

    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode node = head;
        Set<ListNode> listNodeSet = new HashSet<>();
        while (node != null) {
            if (listNodeSet.add(node))
                node = node.next;
            else return true;
        }
        return false;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}