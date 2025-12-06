// Last updated: 12/6/2025, 8:24:01 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int maxCount = 0;
4        int count = 0;
5
6        for (int num : nums) {
7            if (num == 1) {
8                count++;
9                maxCount = Math.max(maxCount, count);
10            } else {
11                count = 0;
12            }
13        }
14
15        return maxCount;
16    }
17}
18