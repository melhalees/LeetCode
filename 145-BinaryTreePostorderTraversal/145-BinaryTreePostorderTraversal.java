// Last updated: 10/19/2025, 4:58:54 AM
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        dfsPostOrder(root, ans);

        return ans;
    }
    private void dfsPostOrder(TreeNode node, List<Integer> ans) {
        if (node == null) return;

        dfsPostOrder(node.left, ans);
        dfsPostOrder(node.right, ans);
        ans.add(node.val);
    }
}