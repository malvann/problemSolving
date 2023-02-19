package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindFirstAndLastPositionOfElementInSortedArrayTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int target, int[] nums, int[] result) {
        assertArrayEquals(result, new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(1, new int[]{1}, new int[]{0, 0}),
                Arguments.of(8, new int[]{5, 7, 7, 8, 8, 10}, new int[]{3, 4}),
                Arguments.of(6, new int[]{5, 7, 7, 8, 8, 10}, new int[]{-1, -1}),
                Arguments.of(8, new int[]{}, new int[]{-1, -1})
        );
    }
}