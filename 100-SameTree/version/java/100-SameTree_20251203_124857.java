// Last updated: 12/3/2025, 12:48:57 PM
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
17    public boolean isSameTree(TreeNode p, TreeNode q) {
18        if ((p == null && q != null) || (p != null && q == null)) return false;
19
20        if (p == null && q == null) return true;
21
22        if (p.val != q.val) return false;
23
24        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
25    }
26}
27