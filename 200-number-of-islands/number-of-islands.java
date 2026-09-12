
class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (vis[i][j] == 0 && grid[i][j] == '1') {
                    count++;

                    dfs(i, j, vis, grid);
                }
            }
        }

        return count;
    }

    public void dfs(int r, int c, int[][] vis, char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        // Mark the current cell as visited
        vis[r][c] = 1;

        // Four directions:
        // Up, Right, Down, Left
        int[] dr = { -1, 0, 1, 0 };
        int[] dc = { 0, 1, 0, -1 };

        for (int k = 0; k < 4; k++) {
            int nrow = r + dr[k];
            int ncol = c + dc[k];

            // Check boundaries, land, and visited status
            if (nrow >= 0 && nrow < n &&
                    ncol >= 0 && ncol < m &&
                    grid[nrow][ncol] == '1' &&
                    vis[nrow][ncol] == 0) {

                dfs(nrow, ncol, vis, grid);
            }
        }
    }
}