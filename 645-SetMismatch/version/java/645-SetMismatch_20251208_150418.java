// Last updated: 12/8/2025, 3:04:18 PM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int n = nums.length;
4        int xor = 0;
5
6        for (int x : nums) xor ^= x;
7        for (int i = 1; i <= n; i++) xor ^= i;
8
9        int lsb = xor & -xor;
10
11        int a = 0, b = 0;
12        for (int x : nums) {
13            if ((x & lsb) != 0) a ^= x;
14            else b ^= x;
15        }
16        for (int i = 1; i <= n; i++) {
17            if ((i & lsb) != 0) a ^= i;
18            else b ^= i;
19        }
20
21        for (int x : nums) {
22            if (x == a) return new int[]{a, b};
23        }
24
25        return new int[]{b, a};
26    }
27}
28