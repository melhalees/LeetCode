// Last updated: 12/6/2025, 2:34:33 AM
1class Solution {
2    public int countPartitions(int[] nums) {
3        int n = nums.length;
4        int[] prefixSum = new int[n];
5
6        int sum = 0;
7
8        for (int i = 0; i < n; i++) {
9            sum += nums[i];
10            prefixSum[i] = sum;
11        }
12
13        int ans = 0;
14
15        for (int p = 0; p < n - 1; p++) {
16            int firstPart = prefixSum[p];
17            int secondPart = prefixSum[n - 1] - prefixSum[p];
18
19            if ((firstPart - secondPart) % 2 == 0) {
20                ans++;
21            }
22        }
23
24        return ans;
25    }
26}