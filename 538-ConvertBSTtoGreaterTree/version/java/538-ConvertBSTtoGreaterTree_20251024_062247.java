// Last updated: 10/24/2025, 6:22:47 AM
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
    public TreeNode convertBST(TreeNode root) {
        dfs(root, 0);

        return root;
    }

    private int dfs(TreeNode node, int sum) {
        if (node == null) return sum;

        sum = dfs(node.right, sum);
        node.val += sum;
        sum = node.val;

        return dfs(node.left, sum);
    }
}