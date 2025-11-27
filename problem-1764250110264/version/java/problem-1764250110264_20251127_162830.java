// Last updated: 11/27/2025, 4:28:30 PM
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
17    public TreeNode bstFromPreorder(int[] preorder) {
18        if (preorder.length == 0) return null;
19
20        TreeNode root = new TreeNode(preorder[0]);
21        Stack<TreeNode> stack = new Stack<>();
22
23        stack.push(root);
24
25        for (int i = 1; i < preorder.length; i++) {
26            TreeNode node = new TreeNode(preorder[i]);
27
28            TreeNode temp = null;
29
30            while (!stack.isEmpty() && preorder[i] > stack.peek().val) {
31                temp = stack.pop();
32            }
33
34            if (temp != null) {
35                temp.right = node;
36            } else {
37                stack.peek().left = node;
38            }
39
40            stack.push(node);
41        }
42
43        return root;
44    }
45}