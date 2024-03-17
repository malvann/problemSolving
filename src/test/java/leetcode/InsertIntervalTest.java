package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertIntervalTest {
    @ParameterizedTest
    @MethodSource
    void test(int[][] nums, int[] mew, int[][] result) {
        assertArrayEquals(result, new InsertInterval().insert(nums, mew));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[][]{{2, 6}, {7, 9}}, new int[]{15, 18}, new int[][]{{2, 6}, {7, 9}, {15, 18}}),
                Arguments.of(new int[][]{{1, 5}}, new int[]{0, 6}, new int[][]{{0, 6}}),
                Arguments.of(new int[][]{{1, 5}}, new int[]{0, 0}, new int[][]{{0, 0}, {1, 5}}),
                Arguments.of(new int[][]{{1, 5}}, new int[]{0, 3}, new int[][]{{0, 5}}),
                Arguments.of(new int[][]{{1, 5}}, new int[]{2, 3}, new int[][]{{1, 5}}),
                Arguments.of(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5}, new int[][]{{1, 5}, {6, 9}}),
                Arguments.of(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}, new int[][]{{1, 2}, {3, 10}, {12, 16}})
        );
    }
}