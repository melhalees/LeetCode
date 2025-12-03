// Last updated: 12/3/2025, 2:33:16 PM
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
19        traverse(root, 0, result);
20        return result;
21    }
22
23    private void traverse(TreeNode node, int level, List<List<Integer>> result) {
24        if (node == null) return;
25
26        if (result.size() == level) {
27            result.add(new ArrayList<>());
28        }
29
30        result.get(level).add(node.val);
31
32        traverse(node.left, level + 1, result);
33        traverse(node.right, level + 1, result);
34    }
35}
36