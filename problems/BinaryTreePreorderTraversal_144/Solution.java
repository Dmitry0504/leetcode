package problems.BinaryTreePreorderTraversal_144;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        if(root != null){
            linkedList.push(root);

            while (!linkedList.isEmpty()) {

                TreeNode treeNode = linkedList.pop();
                list.add(treeNode.val);
                System.out.println(treeNode.val);
                if(treeNode.right != null) {
                    linkedList.push(treeNode.right);
                }

                if(treeNode.left != null) {
                    linkedList.push(treeNode.left);
                }
            }
        }

        return list;
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