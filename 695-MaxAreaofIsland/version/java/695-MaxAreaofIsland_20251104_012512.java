// Last updated: 11/4/2025, 1:25:12 AM
import java.util.*;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int ans = 0;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                if (grid[row][col] == 1) {
                    Queue<int[]> queue = new ArrayDeque<>();
                    queue.offer(new int[]{row, col});
                    grid[row][col] = -1; // mark visited

                    int counter = 0;

                    while (!queue.isEmpty()) {
                        int[] cell = queue.poll();
                        counter++;

                        int r = cell[0], c = cell[1];

                        if (r > 0 && grid[r - 1][c] == 1) {
                            grid[r - 1][c] = -1;
                            queue.offer(new int[]{r - 1, c});
                        }

                        if (r < m - 1 && grid[r + 1][c] == 1) {
                            grid[r + 1][c] = -1;
                            queue.offer(new int[]{r + 1, c});
                        }

                        if (c > 0 && grid[r][c - 1] == 1) {
                            grid[r][c - 1] = -1;
                            queue.offer(new int[]{r, c - 1});
                        }

                        if (c < n - 1 && grid[r][c + 1] == 1) {
                            grid[r][c + 1] = -1;
                            queue.offer(new int[]{r, c + 1});
                        }
                    }

                    ans = Math.max(ans, counter);
                }
            }
        }

        return ans;
    }
}
