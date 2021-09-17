package problems.MaxDepthOfBinaryTree_104;

public class Solution {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3, null,
                new TreeNode(1,
                        new TreeNode(2), null)
        );

        System.out.println(new Solution().maxDepth(root));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
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
