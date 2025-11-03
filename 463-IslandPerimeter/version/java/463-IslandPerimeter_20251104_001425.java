// Last updated: 11/4/2025, 12:14:25 AM
class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    perimeter += 4;

                    if (r >= 1 && grid[r - 1][c] == 1) perimeter -= 2;
                    if (c >= 1 && grid[r][c - 1] == 1) perimeter -= 2;
                }
            }
        }
        return perimeter;
    }
}
