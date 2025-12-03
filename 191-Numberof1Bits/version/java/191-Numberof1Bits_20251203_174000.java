// Last updated: 12/3/2025, 5:40:00 PM
1class Solution {
2    public int hammingWeight(int n) {
3        int count = 0;
4
5        while (n != 0) {
6            n &= (n - 1);
7            count++;
8        }
9
10        return count;
11    }
12}
13