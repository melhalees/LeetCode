// Last updated: 12/2/2025, 3:26:13 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5
6        int left = 0;
7        int right = m * n - 1;
8
9        while (left <= right) {
10            int mid = left + (right - left) / 2;
11
12            int row = mid / n;
13            int col = mid % n;
14
15            int val = matrix[row][col];
16
17            if (val == target) return true;
18            else if (val < target) left = mid + 1;
19            else right = mid - 1;
20        }
21
22        return false;
23    }
24}
25