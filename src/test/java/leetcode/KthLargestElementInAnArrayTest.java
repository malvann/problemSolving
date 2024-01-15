package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KthLargestElementInAnArrayTest {
    @ParameterizedTest
    @MethodSource
    void test(int[] nums, int k, int result) {
        assertEquals(result, new KthLargestElementInAnArray().findKthLargest(nums, k));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 1, 5, 6, 4}, 2, 5),
                Arguments.of(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4, 4)
        );
    }
}