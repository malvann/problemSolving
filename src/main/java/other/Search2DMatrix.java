package other;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowNum = -1;
        if (matrix[0][0] > target || matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1] < target) return false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length == 0) continue;
            if (matrix[i][0] <= target && matrix[i][matrix[i].length - 1] >= target) {
                rowNum = i;
                break;
            }
        }
        if (rowNum == -1) return false;

        for (int num: matrix[rowNum]) {
            if (num == target) return true;
        }
        return false;
    }
}
