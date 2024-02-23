package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheTownJudgeTest {
    @ParameterizedTest
    @MethodSource
    void test(int n, int[][] trust, int result) {
        assertEquals(result, new FindTheTownJudge().findJudge(n, trust));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(4, new int[][]{{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}}, 3),
                Arguments.of(2, new int[][]{{1, 2}}, 2),
                Arguments.of(3, new int[][]{{1, 3}, {2, 3}}, 3),
                Arguments.of(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}, -1)
        );
    }
}