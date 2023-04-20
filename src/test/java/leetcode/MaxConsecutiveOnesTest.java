package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxConsecutiveOnesTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] grid, int result) {
        assertEquals(result, new MaxConsecutiveOnes().findMaxConsecutiveOnes(grid));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 0, 1, 1, 1}, 3)
        );
    }
}