// Last updated: 12/6/2025, 2:56:43 AM
1class Solution {
2    public int countPartitions(int[] nums) {
3        int total = 0;
4        for (int x : nums) total += x;
5
6        if ((total & 1) == 1) return 0;
7
8        return nums.length - 1;
9    }
10}