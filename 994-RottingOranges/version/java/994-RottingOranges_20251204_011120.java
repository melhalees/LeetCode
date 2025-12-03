// Last updated: 12/4/2025, 1:11:20 AM
1class Solution {
2    public int orangesRotting(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        Queue<int[]> queue = new LinkedList<>();
7        int fresh = 0;
8
9        for (int r = 0; r < m; r++) {
10            for (int c = 0; c < n; c++) {
11                if (grid[r][c] == 2) {
12                    queue.offer(new int[]{r, c});
13                } else if (grid[r][c] == 1) {
14                    fresh++;
15                }
16            }
17        }
18
19        if (fresh == 0) return 0;
20
21        int minutes = -1;
22        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
23
24        while (!queue.isEmpty()) {
25            int size = queue.size();
26            minutes++;
27
28            while (size-- > 0) {
29                int[] cur = queue.poll();
30                int r = cur[0], c = cur[1];
31
32                for (int[] d : dirs) {
33                    int nr = r + d[0];
34                    int nc = c + d[1];
35
36                    if (nr >= 0 && nc >= 0 && nr < m && nc < n && grid[nr][nc] == 1) {
37                        grid[nr][nc] = 2;
38                        fresh--;
39                        queue.offer(new int[]{nr, nc});
40                    }
41                }
42            }
43        }
44
45        return (fresh == 0) ? minutes : -1;
46    }
47}
48