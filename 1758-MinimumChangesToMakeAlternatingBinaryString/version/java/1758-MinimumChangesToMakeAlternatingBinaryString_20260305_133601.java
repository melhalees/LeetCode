// Last updated: 3/5/2026, 1:36:01 PM
1class Solution {
2    public int minOperations(String s) {
3        int count0 = 0;
4        int n = s.length();
5        
6        for (int i = 0; i < n; i++) {
7            char expected = (i % 2 == 0) ? '0' : '1';
8            
9            if (s.charAt(i) != expected) {
10                count0++;
11            }
12        }
13
14        return Math.min(count0, n - count0);
15    }
16}