package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxConsecutiveOnesIITest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] arr, int result) {
        assertEquals(result, new MaxConsecutiveOnesII().findMaxConsecutiveOnes(arr));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 1, 0, 0}, 4),
                Arguments.of(new int[]{0, 0, 0, 0, 1}, 2),
                Arguments.of(new int[]{1, 0, 1, 1, 1, 0}, 5),
                Arguments.of(new int[]{1, 0, 1, 0, 0, 1, 1, 1, 0, 1}, 5),
                Arguments.of(new int[]{1, 0, 1, 1, 0}, 4),
                Arguments.of(new int[]{1, 0, 1, 0, 1}, 3)
        );
    }
}