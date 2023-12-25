package Leetcode;

import Structure.TreeNode;

public class P0108 {
    /**
     * Given an integer array nums where the elements are sorted in ascending order, convert it to a
     * height-balanced
     *  binary search tree.
     *
     *  Input: nums = [-10,-3,0,5,9]
     * Output: [0,-3,9,-10,null,5]
     * Explanation: [0,-10,5,null,-3,null,9] is also accepted:
     */

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length-1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int l, int r) {
        if(l > r) {
            return null;
        }
        int mid = l + (r-l)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, l, mid-1);
        root.right = sortedArrayToBST(nums, mid+1, r);
        return root;
    }
}
