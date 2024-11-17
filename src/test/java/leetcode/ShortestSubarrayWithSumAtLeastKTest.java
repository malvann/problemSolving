package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShortestSubarrayWithSumAtLeastKTest {
    @ParameterizedTest
    @MethodSource()
    void test(int[] nums, int k, int result) {
        assertEquals(result, new ShortestSubarrayWithSumAtLeastK().shortestSubarray(nums, k));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{45, 95, 97, -34, -42}, 21, 1),
                Arguments.of(new int[]{48, 99, 37, 4, -31}, 140, 2),
                Arguments.of(new int[]{1}, 1, 1),
                Arguments.of(new int[]{1, 2}, 4, -1),
                Arguments.of(new int[]{2, -1, 2}, 3, 3)
        );
    }
}