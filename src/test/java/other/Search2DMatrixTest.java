package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Search2DMatrixTest {
    @Test
    void test() {
        Search2DMatrix target = new Search2DMatrix();
        assertTrue(target.searchMatrix(new int[][]{{1,3}}, 3));
        assertTrue(target.searchMatrix(new int[][]{{1}}, 1));
        assertTrue(target.searchMatrix(new int[][]{{1, 2, 4, 8}, {10, 11, 12, 13}, {14, 20, 30, 40}}, 10));
    }

}