// Last updated: 11/27/2025, 6:55:59 PM
1class Solution {
2    public int differenceOfSums(int n, int m) {
3        int num1 = 0, num2 = 0;
4        
5        for (int i = 1; i <= n; i++) {
6            if (i % m == 0) {
7                num2 += i;
8            } else {
9                num1 += i;
10            }
11        }
12
13        return num1 - num2;
14    }
15}