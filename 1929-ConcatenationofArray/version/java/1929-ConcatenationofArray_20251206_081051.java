// Last updated: 12/6/2025, 8:10:51 AM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[2 * n];
5
6        for (int i = 0; i < n; i++) {
7            ans[i] = nums[i];
8            ans[i + n] = nums[i];
9        }
10
11        return ans;
12    }
13}