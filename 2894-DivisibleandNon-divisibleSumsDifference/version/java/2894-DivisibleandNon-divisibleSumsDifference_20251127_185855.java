// Last updated: 11/27/2025, 6:58:55 PM
1class Solution {
2    public int differenceOfSums(int n, int m) {
3        return (n * (n + 1) / 2) - (m * (n / m) * (n / m + 1));
4    }
5}