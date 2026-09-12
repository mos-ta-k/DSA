public class NumberOfIslands {

    private void dfs(
            int i,
            int j,
            boolean[][] visited,
            char[][] grid,
            int rows,
            int columns
    ) {

        if (i < 0 || j < 0 ||
            i >= rows || j >= columns ||
            visited[i][j] ||
            grid[i][j] != '1') {
            return;
        }

        visited[i][j] = true;


        dfs(i - 1, j, visited, grid, rows, columns); // up
        dfs(i + 1, j, visited, grid, rows, columns); // down
        dfs(i, j - 1, visited, grid, rows, columns); // left
        dfs(i, j + 1, visited, grid, rows, columns); // right
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int columns = grid[0].length;
        int islands = 0;

        boolean[][] visited = new boolean[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (grid[i][j] == '1' && !visited[i][j]) {
                    dfs(i, j, visited, grid, rows, columns);
                    islands++;
                }
            }
        }

        return islands;
    }
}
 
