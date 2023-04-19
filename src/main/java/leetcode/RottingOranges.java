package leetcode;

public class RottingOranges {
    private static final int NORMAL_ORANGE = 1;
    private static final int ROTTEN_ORANGE = 2;
    private int counter = 0;
    private boolean containNormalOranges;
    private int[][] refreshed;
    private int[][] grid;

    public int orangesRotting(int[][] grid) {
        fromMinute(grid);
        return containNormalOranges ? -1 : counter;
    }

    public void fromMinute(int[][] grid) {
        this.grid = grid;
        this.refreshed = new int[grid.length][grid[0].length];
        this.containNormalOranges = false;

        boolean doChanges = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (rotting(i, j)) doChanges = true;
                checkForNormal(i, j);
            }
        }
        if (doChanges) {
            counter++;
            fromMinute(refreshed);
        }
    }

    private void checkForNormal(int i, int j) {
        if (!containNormalOranges)
            containNormalOranges = refreshed[i][j] == NORMAL_ORANGE
                    || (j - 1 >= 0 && refreshed[i][j - 1] == NORMAL_ORANGE)
                    || (i - 1 >= 0 && refreshed[i - 1][j] == NORMAL_ORANGE);
    }

    private boolean rotting(int i, int j) {
        if (refreshed[i][j] != ROTTEN_ORANGE) refreshed[i][j] = grid[i][j];

        if (grid[i][j] == ROTTEN_ORANGE) {
            return toRotten(i, j - 1) | toRotten(i, j + 1) | toRotten(i + 1, j) | toRotten(i - 1, j);
        }
        return false;
    }

    private boolean toRotten(int i, int j) {
        if (j >= 0 && j < grid[0].length
                && i < grid.length && i >= 0
                && grid[i][j] == NORMAL_ORANGE) {
            refreshed[i][j] = ROTTEN_ORANGE;
            return true;
        }
        return false;
    }
}
