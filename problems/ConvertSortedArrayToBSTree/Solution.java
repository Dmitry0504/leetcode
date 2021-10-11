package problems.ConvertSortedArrayToBSTree;

public class Solution {
    public static void main(String[] args) {

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildSubBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildSubBST(int[] nums, int start, int end) {
        if (start > end)
            return null;

        int mid = (start + end) / 2;
        TreeNode midNode = new TreeNode(nums[mid]);
        midNode.left = buildSubBST(nums, start, mid - 1);
        midNode.right = buildSubBST(nums, mid + 1, end);
        return midNode;
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

