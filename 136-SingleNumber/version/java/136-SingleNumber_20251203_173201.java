// Last updated: 12/3/2025, 5:32:01 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3        int ans = 0;
4
5        for (int num : nums) {
6            ans ^= num;
7        }
8
9        return ans;
10    }
11}
12