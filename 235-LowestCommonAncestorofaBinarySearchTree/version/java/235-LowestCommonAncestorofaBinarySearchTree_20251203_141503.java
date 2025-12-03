// Last updated: 12/3/2025, 2:15:03 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10
11class Solution {
12    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
13        if (root == null) return null;
14
15        int rv = root.val;
16        int pv = p.val;
17        int qv = q.val;
18
19        if (pv < rv && qv < rv) {
20            return lowestCommonAncestor(root.left, p, q);
21        }
22
23        if (pv > rv && qv > rv) {
24            return lowestCommonAncestor(root.right, p, q);
25        }
26
27        return root;
28    }
29}