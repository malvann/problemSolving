package hackerrank;

import java.util.List;

public class LarrysArray {
    public static final String YES = "YES";
    public static final String NO = "NO";
    private List<Integer> grid;

    public String larrysArray(List<Integer> grid) {
        this.grid = grid;

        boolean needSwap = false;
        for (int i = 0; i < grid.size() - 2; i++) {
            if (grid.get(i) != i + 1) {
                swap(i, i + 1);
                needSwap = true;
            }

        }
        return this.grid.get(grid.size() - 1) == grid.size() && needSwap ? YES : NO;
    }

    private void swap(int index, int expectedNum) {
        if (grid.get(index + 1) != expectedNum && grid.get(index + 2) != expectedNum) swap(index + 1, expectedNum);

        int buff = grid.get(index);
        if (grid.get(index + 1) == expectedNum) {
            grid.set(index, grid.get(index + 1));
            grid.set(index + 1, grid.get(index + 2));
            grid.set(index + 2, buff);
        } else if (grid.get(index + 2) == expectedNum) {
            grid.set(index, grid.get(index + 2));
            grid.set(index + 2, grid.get(index + 1));
            grid.set(index + 1, buff);
        }
    }
}
