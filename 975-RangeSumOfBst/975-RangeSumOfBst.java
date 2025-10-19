// Last updated: 10/19/2025, 4:58:30 AM
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
    private int sum = 0;
    private int low, high;

    public int rangeSumBST(TreeNode root, int low, int high) {
        this.low = low;
        this.high = high;
        dfs(root);
        return sum;
    }

    private void dfs(TreeNode node) {
        if (node == null) return;

        if (node.val > low) dfs(node.left);
        if (node.val >= low && node.val <= high) sum += node.val;
        if (node.val < high) dfs(node.right);
    }
}