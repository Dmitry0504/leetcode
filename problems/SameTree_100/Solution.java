package problems.SameTree_100;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode root1 = new TreeNode(1, node2, node3);

        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(2);
        TreeNode root2 = new TreeNode(1, node4, node5);

        System.out.println(new Solution().isSameTree(root1, root2));
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == q) return true;
        if (p == null || q == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(p);
        queue.add(q);
        while (!queue.isEmpty()) {
            TreeNode p1 = queue.remove();
            TreeNode q1 = queue.remove();

            if (p1 == null && q1 != null) return false;
            if (p1 != null && q1 == null) return false;

            if (p1 != null && q1 != null) {
                if (p1.val != q1.val) return false;
                queue.add(p1.left);
                queue.add(q1.left);
                queue.add(p1.right);
                queue.add(q1.right);
            }
        }
        return true;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
