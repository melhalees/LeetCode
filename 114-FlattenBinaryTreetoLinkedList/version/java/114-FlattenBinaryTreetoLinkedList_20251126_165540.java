// Last updated: 11/26/2025, 4:55:40 PM
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
17    public void flatten(TreeNode root) {
18        flattenTree(root);
19    }
20
21    private TreeNode flattenTree(TreeNode node) {
22        if (node == null) return null;
23
24        TreeNode leftTail = flattenTree(node.left);
25        TreeNode rightTail = flattenTree(node.right);
26
27        if (leftTail != null) {
28            leftTail.right = node.right;
29
30            node.right = node.left;
31
32            node.left = null;
33        }
34
35        if (rightTail != null) return rightTail;
36        if (leftTail != null) return leftTail;
37        return node;
38    }
39}
40