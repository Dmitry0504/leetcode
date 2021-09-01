package problems.BinaryTreePostorderTraversal_145;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3,
                new TreeNode(1),
                new TreeNode(2)
        );

        System.out.println(new Solution().postorderTraversal(root));
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        Deque<TreeNode> nodes = new LinkedList<>();
        List<Integer> integers = new ArrayList<>();

        TreeNode currentNode = root;
        while (currentNode != null || !nodes.isEmpty()) {
            if (currentNode != null) {
                nodes.push(currentNode);
                integers.add(0, currentNode.val);
                currentNode = currentNode.right;
            } else {
                currentNode = nodes.pop();
                currentNode = currentNode.left;
            }
        }

        return integers;
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
