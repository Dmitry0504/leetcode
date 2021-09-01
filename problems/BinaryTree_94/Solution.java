package problems.BinaryTree_94;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, null,
                new TreeNode(1,
                        new TreeNode(2), null)
        );

        System.out.println(new Solution().inorderTraversal(root));
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> integers = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<>();

        TreeNode currentNode = root;

        while (currentNode != null || !stack.isEmpty()) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            currentNode = stack.pop();
            integers.add(currentNode.val);
            currentNode = currentNode.right;
        }
        Collections.reverse(integers);
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
