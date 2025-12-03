// Last updated: 12/3/2025, 2:45:41 PM
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
17    public List<Integer> rightSideView(TreeNode root) {
18        List<Integer> result = new ArrayList<>();
19        if (root == null) return result;
20
21        Queue<TreeNode> q = new ArrayDeque<>();
22        q.offer(root);
23
24        while (!q.isEmpty()) {
25            int size = q.size();
26            TreeNode last = null;
27            for (int i = 0; i < size; i++) {
28                TreeNode node = q.poll();
29                last = node;
30                if (node.left != null) q.offer(node.left);
31                if (node.right != null) q.offer(node.right);
32            }
33            result.add(last.val);
34        }
35
36        return result;
37    }
38}
39