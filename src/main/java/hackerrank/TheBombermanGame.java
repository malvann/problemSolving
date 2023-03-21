package hackerrank;

import java.util.List;
import java.util.stream.Stream;

public class TheBombermanGame {
    private static final int BOMB = 'O';
    private static final int EMPTY = '.';
    private static final int X = 'X';
    private char[][] arr;

    public List<String> bomberMan(int n, List<String> grid) {
        if (n == 1) return grid;
        if (n % 2 == 0) return grid.stream().map(s -> "O".repeat(s.length())).toList();

        arr = grid.stream().map(String::toCharArray).toArray(char[][]::new);

        iteration();
        int k = (int) Math.floor(((double) n) / 3);
        int x = n - k * 3;
        if ((x == 1 || x == 2) && k % 3 != 0) iteration();

        return Stream.of(arr).map(String::new).toList();
    }

    private void iteration() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                explode(i, j);
            }
        }
    }

    private void explode(int i, int j) {
        if (arr[i][j] == X) arr[i][j] = EMPTY;
        else if (arr[i][j] == EMPTY) arr[i][j] = BOMB;
        else if (arr[i][j] == BOMB) {
            arr[i][j] = EMPTY;
            if (j + 1 < arr[0].length && arr[i][j + 1] != BOMB) arr[i][j + 1] = X;
            if (i + 1 < arr.length && arr[i + 1][j] != BOMB) arr[i + 1][j] = X;
            if (j - 1 > -1) arr[i][j - 1] = EMPTY;
            if (i - 1 > -1) arr[i - 1][j] = EMPTY;
        }
    }
}
