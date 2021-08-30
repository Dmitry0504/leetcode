package problems.SymmetricTree_101;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode root = new TreeNode(1, node2, node3);

        System.out.println(new Solution().isSymmetric(root));
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()) {
            TreeNode leftNode = queue.remove();
            TreeNode rightNode = queue.remove();

            if (leftNode == null && rightNode == null) continue;

            if (leftNode == null) return false;

            if (rightNode == null) return false;

            if (leftNode.val != rightNode.val) return false;

            queue.add(leftNode.left);
            queue.add(rightNode.right);
            queue.add(leftNode.right);
            queue.add(rightNode.left);
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