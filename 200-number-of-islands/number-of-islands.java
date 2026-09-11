class Pair {
    int r;
    int c;

    Pair(int row, int col) {
        this.r = row;
        this.c = col;
    }
}

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
                    bfs(i, j, vis, grid);
                }
            }
        }
        return count;
    }

    public void bfs(int i, int j, int[][] vis, char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i, j));
        vis[i][j] = 1;
        // 4 directions:
        // Up, Right, Down, Left
        int[] dr = { -1, 0, 1, 0 };
        int[] dc = { 0, 1, 0, -1 };
        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int r = curr.r;
            int c = curr.c;
            for (int k = 0; k < 4; k++) {
                int nrow = r + dr[k];
                int ncol = c + dc[k];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && grid[nrow][ncol] == '1' && vis[nrow][ncol] == 0) {
                    vis[nrow][ncol] = 1;
                    q.add(new Pair(nrow, ncol));
                }
            }
        }
    }
}