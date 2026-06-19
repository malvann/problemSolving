package other;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    private static int LINE_SIZE = 9;

    public boolean isValidSudoku(char[][] board) {
        Set<Integer> intSet = HashSet.newHashSet(9);
        int digitCount = 0;
        for (int i = 0; i < LINE_SIZE; i++) {
            for (int j = 0; j < LINE_SIZE; j++) {
                if (Character.isDigit(board[i][j])) {
                    intSet.add(Character.getNumericValue(board[i][j]));
                    digitCount++;
                }
            }
            if (intSet.size() < digitCount) return false;
            intSet.clear();
            digitCount = 0;
        }

        for (int i = 0; i < LINE_SIZE; i++) {
            for (int j = 0; j < LINE_SIZE; j++) {
                if (Character.isDigit(board[j][i])) {
                    intSet.add(Character.getNumericValue(board[j][i]));
                    digitCount++;
                }
            }
            if (intSet.size() < digitCount) return false;
            intSet.clear();
            digitCount = 0;
        }

        for (int i = 0; i < LINE_SIZE; i = i + 3) {
            for (int j = 0; j < LINE_SIZE; j = j + 3) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (Character.isDigit(board[i + k][j + l])) {
                            intSet.add(Character.getNumericValue(board[i + k][j + l]));
                            digitCount++;
                        }
                    }
                }
                if (intSet.size() < digitCount) return false;
                intSet.clear();
                digitCount = 0;
            }
        }
        return true;
    }
}
