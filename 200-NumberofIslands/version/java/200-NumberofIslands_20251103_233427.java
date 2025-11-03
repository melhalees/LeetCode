// Last updated: 11/3/2025, 11:34:27 PM
class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int count = 0;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == '1') {
                    dfs(grid, row, col);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int row, int col) {
        int m = grid.length, n = grid[0].length;
        if (row < 0 || col < 0 || row >= m || col >= n || grid[row][col] == '0') return;

        grid[row][col] = '0';

        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}