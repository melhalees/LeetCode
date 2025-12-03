// Last updated: 12/3/2025, 2:31:49 PM
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
17    public List<List<Integer>> levelOrder(TreeNode root) {
18        List<List<Integer>> result = new ArrayList<>();
19
20        if (root == null) return result;
21
22        Queue<TreeNode> q = new ArrayDeque<>();
23        q.offer(root);
24
25        while (!q.isEmpty()) {
26            int size = q.size();
27            List<Integer> bucket = new ArrayList<>();
28
29            for (int i = 0; i < size; i++) {
30                TreeNode node = q.poll();
31                bucket.add(node.val);
32
33                if (node.left != null) q.offer(node.left);
34                if (node.right != null) q.offer(node.right);
35            }
36
37            result.add(bucket);
38        }
39
40        return result;
41    }
42}
43