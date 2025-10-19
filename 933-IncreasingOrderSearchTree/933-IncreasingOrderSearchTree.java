// Last updated: 10/19/2025, 4:58:32 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private TreeNode current;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode result = new TreeNode(-1);
        current = result;
        inOrder(root);
        return result.right;
    }

    private void inOrder(TreeNode node) {
        if (node == null) return;

        inOrder(node.left);
        node.left = null;
        current.right = node;
        current = node;
        inOrder(node.right);
    }
}