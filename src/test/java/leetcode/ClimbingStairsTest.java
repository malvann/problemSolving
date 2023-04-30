package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingStairsTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int num, int expected) {
        assertEquals(expected, new ClimbingStairs().climbStairs(num));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(5, 8),
                Arguments.of(4, 5),
                Arguments.of(2, 2),
                Arguments.of(3, 3)
        );
    }
}