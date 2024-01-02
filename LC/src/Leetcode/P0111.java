package Leetcode;

import Structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class P0111 {
    /**
     * Minimum Depth of Binary Tree
     *
     * Given a binary tree, find its minimum depth.
     *
     * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
     *
     * Note: A leaf is a node with no children.
     *
     */

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int ans = 1;
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode node = queue.remove();
                if(node.left == null && node.right == null) {
                    //leaf node
                    return ans;
                }
                if(node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queue.add(node.right);
                }
            }
            ans++;
        }
        return ans;
    }
}
