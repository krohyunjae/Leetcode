package Leetcode;

import Structure.TreeNode;

public class P0112 {
    /**
     * Path Sum
     *
     * Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that
     * adding up all the values along the path equals targetSum.
     *
     * A leaf is a node with no children.
     */
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.left == null && root.right == null) return root.val == targetSum;

        boolean left = hasPathSum(root.left, targetSum - root.val);
        boolean right = hasPathSum(root.right, targetSum - root.val);

        return left || right;
    }

    private boolean helper(TreeNode root, int targetSum) {
        return false;
    }

}
