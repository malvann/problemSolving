package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PerfectSquaresTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int number, int result) {
        assertEquals(result, new PerfectSquares().numSquares(number));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(43, 3),//9 + 9 + 25
                Arguments.of(67, 3),
                Arguments.of(1, 1),
                Arguments.of(12, 3),//4 + 4 + 4
                Arguments.of(13, 2)// 4 + 9
        );
    }
}