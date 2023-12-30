package Leetcode;

import Structure.TreeNode;

public class P0110 {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(getHeight(root) == -1) return false;
        return true;
    }

    private int getHeight(TreeNode root) {
        if(root == null) return 0;
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if(leftHeight == -1 || rightHeight == -1) return -1;

        if(Math.abs(leftHeight - rightHeight) > 1) return -1;

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
