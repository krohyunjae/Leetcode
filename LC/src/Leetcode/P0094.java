package Leetcode;

import Structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class P0094 {
    /**
     * Given the root of a binary tree, return the inorder traversal of its nodes' values.
     *
     * Input: root = [1,null,2,3]
     * Output: [1,3,2]
     * Example 2:
     *
     * Input: root = []
     * Output: []
     * Example 3:
     *
     * Input: root = [1]
     * Output: [1]
     *
     * Constraints:
     *
     * The number of nodes in the tree is in the range [0, 100].
     * -100 <= Node.val <= 100
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorderTraversal(root, ans);
        return ans;
    }

    private void inorderTraversal(TreeNode root, List<Integer> ans) {
        if(root != null) {
            inorderTraversal(root.left, ans);
            ans.add(root.val);
            inorderTraversal(root.right, ans);
        }
    }
}
