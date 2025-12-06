// Last updated: 12/6/2025, 8:17:30 AM
1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int SHIFT = 10000;
4
5        for (int i = 0; i < n; i++) {
6            nums[i] = nums[i] + nums[i + n] * SHIFT;
7        }
8
9        int index = 2 * n - 1;
10
11        for (int i = n - 1; i >= 0; i--) {
12            int xi = nums[i] % SHIFT;
13            int yi = nums[i] / SHIFT;
14
15            nums[index--] = yi;
16            nums[index--] = xi;
17        }
18
19        return nums;
20    }
21}
22