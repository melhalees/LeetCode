// Last updated: 11/27/2025, 1:10:13 AM
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
17    public TreeNode constructMaximumBinaryTree(int[] nums) {
18        return build(nums, 0, nums.length - 1);
19    }
20
21    private TreeNode build(int[] nums, int startIndex, int endIndex) {
22        if (startIndex > endIndex) return null;
23
24        int maxIndex = startIndex;
25
26        for (int i = startIndex + 1; i <= endIndex; i++) {
27            if (nums[i] > nums[maxIndex]) {
28                maxIndex = i;
29            }
30        }
31
32        TreeNode root = new TreeNode(nums[maxIndex]);
33
34        root.left = build(nums, startIndex, maxIndex - 1);
35        root.right = build(nums, maxIndex + 1, endIndex);
36
37        return root;
38    }
39}