// Last updated: 12/3/2025, 12:41:58 PM
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
17    public boolean isBalanced(TreeNode root) {
18        return height(root) != -1;
19    }
20
21    private int height(TreeNode node) {
22        if (node == null) return 0;
23
24        int left = height(node.left);
25        if (left == -1) return -1;
26
27        int right = height(node.right);
28        if (right == -1) return -1;
29
30        if (Math.abs(left - right) > 1) return -1;
31
32        return Math.max(left, right) + 1;
33    }
34}