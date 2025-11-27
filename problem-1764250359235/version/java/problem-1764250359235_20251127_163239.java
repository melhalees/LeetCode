// Last updated: 11/27/2025, 4:32:39 PM
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
17
18    private int idx = 0;
19
20    public TreeNode bstFromPreorder(int[] preorder) {
21        return build(preorder, Integer.MAX_VALUE);
22    }
23
24    private TreeNode build(int[] preorder, int bound) {
25        if (idx == preorder.length || preorder[idx] > bound) {
26            return null;
27        }
28
29        int val = preorder[idx++];
30        TreeNode root = new TreeNode(val);
31
32        root.left = build(preorder, val);
33
34        root.right = build(preorder, bound);
35
36        return root;
37    }
38}