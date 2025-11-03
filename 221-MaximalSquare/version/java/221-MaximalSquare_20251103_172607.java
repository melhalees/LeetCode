// Last updated: 11/3/2025, 5:26:07 PM
class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] dp = new int[m][n];
        int ans = 0;

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (matrix[r][c] == '1') {
                    if (r == 0 || c == 0) {
                        dp[r][c] = 1;
                    } else {
                        dp[r][c] = Math.min(
                            Math.min(dp[r - 1][c - 1], dp[r - 1][c]),
                            dp[r][c - 1]
                        ) + 1;
                    }
                    ans = Math.max(ans, dp[r][c]);
                }
            }
        }

        return ans * ans;
    }
}
