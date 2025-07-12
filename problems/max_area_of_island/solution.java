class Solution {
    public int dfs(int i, int j, int[][] vis, int[][] grid) {
        vis[i][j] = 1;
        int count = 1;
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        for(int[] d : dir) {
            int x = i + d[0], y = j + d[1];
            if(x < grid.length && x >= 0 && y < grid[0].length && y >= 0 && vis[x][y] == 0 && grid[x][y] == 1) {
                count += dfs(x, y, vis, grid);
            }
        }
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] vis = new int[m][n];
        int[] count = {0};
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(vis[i][j] == 0 && grid[i][j] == 1) {
                    max = Math.max(max, dfs(i, j, vis, grid));
                }
            }
        }
        return max;
    }
}