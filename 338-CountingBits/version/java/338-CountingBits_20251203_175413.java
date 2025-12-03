// Last updated: 12/3/2025, 5:54:13 PM
1class Solution {
2    public int[] countBits(int n) {
3        int[] ans = new int[n + 1];
4        int onesBitCounter = 0;
5
6        ans[0] = 0;
7        
8        int currentI = 0;
9
10        for (int i = 1; i <= n; i++) {
11            currentI = i;
12            while (currentI != 0) {
13                currentI &= (currentI - 1);
14                onesBitCounter++;
15            }
16            ans[i] = onesBitCounter;
17            onesBitCounter = 0;
18        }
19
20        return ans;
21    }
22}
23