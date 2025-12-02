// Last updated: 12/2/2025, 4:55:38 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    private int diameter = 0;
18
19    public int diameterOfBinaryTree(TreeNode root) {
20        dfs(root);
21        return diameter;
22    }
23
24    private int dfs(TreeNode root) {
25        if (root == null) return 0;
26
27        int left = dfs(root.left);
28        int right = dfs(root.right);
29
30        diameter = Math.max(diameter, left + right);
31
32        return 1 + Math.max(left, right);
33    }
34}
35