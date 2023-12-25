package Leetcode;

import Structure.TreeNode;

public class P0104 {
    /**
     * Given the root of a binary tree, return its maximum depth.
     *
     * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     */
    public int maxDepth1(TreeNode root) {
        if(root == null) return 0;
         return helper(root, 1);
    }

    private int helper(TreeNode root, int depth) {
        if(root == null) return depth;
        int leftDepth = depth, rightDepth = depth;
        if(root.left != null) {
            leftDepth = helper(root.left, depth+1);
        }
        if(root.right != null) {
            rightDepth = helper(root.right, depth+1);
        }

        if(leftDepth > rightDepth) {
            return leftDepth;
        } else {
            return rightDepth;
        }
    }

    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right) + 1;
    }


}
