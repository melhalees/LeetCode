// Last updated: 11/2/2025, 6:18:19 PM
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if (grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;

        int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1},  {1, 0},  {1, 1}
        };

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1}); // row, col, path length
        grid[0][0] = 1; // Mark as visited

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0], col = curr[1], length = curr[2];

            if (row == n - 1 && col == n - 1) return length;

            for (int[] dir : directions) {
                int r = row + dir[0], c = col + dir[1];
                if (r >= 0 && r < n && c >= 0 && c < n && grid[r][c] == 0) {
                    queue.add(new int[]{r, c, length + 1});
                    grid[r][c] = 1; // Mark as visited
                }
            }
        }

        return -1;
    }
}
