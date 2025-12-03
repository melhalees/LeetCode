// Last updated: 12/3/2025, 1:50:35 PM
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
17    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
18        if (subRoot == null) return true;
19        if (root == null) return false;
20
21        if (root.val == subRoot.val) {
22            if (isSameTree(root, subRoot)) return true;
23        }
24
25        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
26    }
27
28    private boolean isSameTree(TreeNode a, TreeNode b) {
29        if (a == null && b == null) return true;
30        if (a == null || b == null) return false;
31
32        if (a.val != b.val) return false;
33
34        return isSameTree(a.left, b.left) && isSameTree(a.right, b.right);
35    }
36}