package leetcode;

public class MaxAreaOfIsland {
    private int[][] grid;
    private int maxArea;
    private int currentArea;

    public int maxAreaOfIsland(int[][] grid) {
        this.grid = grid;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                check(i, j);
                if (currentArea != 0){
                    maxArea = Math.max(maxArea, currentArea);
                    currentArea = 0;
                }
            }
        }
        return maxArea;
    }

    private boolean check(int i, int j) {
        if (j < 0 || j >= grid[0].length || i < 0 || i >= grid.length) return false;
        if (this.grid[i][j] == 1) {
            currentArea++;
            grid[i][j] = 0;

            check(i, j + 1);
            check(i + 1, j);
            check(i, j - 1);
            check(i - 1, j);
        }
        return false;
    }
}
