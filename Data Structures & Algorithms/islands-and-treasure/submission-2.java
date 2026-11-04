class Solution {
    int row;
    int col;

    public void islandsAndTreasure(int[][] grid) {
        this.row = grid.length;
        this.col = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 0) {
                    dfs(grid, i + 1, j, 1);
                    dfs(grid, i - 1, j, 1);
                    dfs(grid, i, j + 1, 1);
                    dfs(grid, i, j - 1, 1);
                }
            }
        }
    }

    private void dfs(int[][] grid, int i, int j, int dis) {

        if (i < 0 || i >= row || j < 0 || j >= col ||
            grid[i][j] == -1 || grid[i][j] == 0 ||
            dis >= grid[i][j]) {
            return;
        }

        grid[i][j] = dis;

        dfs(grid, i + 1, j, dis + 1);
        dfs(grid, i - 1, j, dis + 1);
        dfs(grid, i, j + 1, dis + 1);
        dfs(grid, i, j - 1, dis + 1);
    }
}