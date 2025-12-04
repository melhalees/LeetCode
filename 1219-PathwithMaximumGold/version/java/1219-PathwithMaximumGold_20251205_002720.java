// Last updated: 12/5/2025, 12:27:20 AM
1class Solution {
2    int m, n;
3    int[][] grid;
4
5    public int getMaximumGold(int[][] grid) {
6        this.grid = grid;
7        m = grid.length;
8        n = grid[0].length;
9
10        int maxGold = 0;
11
12        for (int i = 0; i < m; i++) {
13            for (int j = 0; j < n; j++) {
14                if (grid[i][j] != 0) {
15                    maxGold = Math.max(maxGold, dfs(i, j));
16                }
17            }
18        }
19
20        return maxGold;
21    }
22
23    private int dfs(int i, int j) {
24        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) return 0;
25
26        int gold = grid[i][j];
27        grid[i][j] = 0;
28
29        int best = 0;
30        best = Math.max(best, dfs(i + 1, j));
31        best = Math.max(best, dfs(i - 1, j));
32        best = Math.max(best, dfs(i, j + 1));
33        best = Math.max(best, dfs(i, j - 1));
34
35        grid[i][j] = gold;
36
37        return gold + best;
38    }
39}
40