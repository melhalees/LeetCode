// Last updated: 11/3/2025, 2:28:43 PM
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;

        int[][] visited = new int[m][n];
        int[][] directions = {{-1, 0}, {0, -1}, {0, 1}, {1, 0}};
        int originalColor = image[sr][sc];

        if (originalColor == color) return image;

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{sr, sc});
        visited[sr][sc] = 1;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0], col = curr[1];

            image[row][col] = color;

            for (int[] dir : directions) {
                int r = row + dir[0], c = col + dir[1];
                if (r >= 0 && r < m && c >= 0 && c < n 
                    && visited[r][c] != 1 
                    && image[r][c] == originalColor) {
                    queue.offer(new int[]{r, c});
                    visited[r][c] = 1;
                }
            }
        }

        return image;
    }
}
