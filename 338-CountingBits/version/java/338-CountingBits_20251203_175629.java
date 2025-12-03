// Last updated: 12/3/2025, 5:56:29 PM
1class Solution {
2    public int[] countBits(int n) {
3        int[] ans = new int[n + 1];
4
5        for (int i = 1; i <= n; i++) {
6            ans[i] = ans[i >> 1] + (i & 1);
7        }
8
9        return ans;
10    }
11}
12