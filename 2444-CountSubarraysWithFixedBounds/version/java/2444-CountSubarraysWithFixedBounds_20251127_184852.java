// Last updated: 11/27/2025, 6:48:52 PM
1class Solution {
2    public long countSubarrays(int[] nums, int minK, int maxK) {
3        long res = 0;
4        int lastMin = -1, lastMax = -1, lastInvalid = -1;
5
6        for (int i = 0; i < nums.length; i++) {
7            if (nums[i] < minK || nums[i] > maxK) {
8                lastInvalid = i;
9            }
10            if (nums[i] == minK) lastMin = i;
11            if (nums[i] == maxK) lastMax = i;
12
13            res += Math.max(0, Math.min(lastMin, lastMax) - lastInvalid);
14        }
15
16        return res;
17    }
18}