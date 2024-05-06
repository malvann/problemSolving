package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PossibleBipartitionTest {
    @ParameterizedTest
    @MethodSource
    void test(int n, int[][] dislikes, boolean result) {
        assertEquals(result, new PossibleBipartition().possibleBipartition(n, dislikes));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(10, new int[][]{{1, 2}, {3, 4}, {5, 6}, {6, 7}, {8, 9}, {7, 8}}, true),
                Arguments.of(5, new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}}, false),
                Arguments.of(4, new int[][]{{1, 2}, {1, 3}, {2, 4}}, true),
                Arguments.of(3, new int[][]{{1, 2}, {1, 3}, {2, 3}}, false)
        );
    }
}