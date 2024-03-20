package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfArrowsToBurstBalloonsTest {
    @ParameterizedTest
    @MethodSource
    void test(int[][] points, int result) {
        assertEquals(result, new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(points));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}, 2),
                Arguments.of(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}, 4),
                Arguments.of(new int[][]{{-1, 1}, {0, 1}, {2, 3}, {1, 2}}, 2),
                Arguments.of(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}, 2)
        );
    }
}