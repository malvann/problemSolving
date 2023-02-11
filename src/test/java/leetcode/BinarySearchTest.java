package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] nums, int target, int result) {
        assertEquals(result, new BinarySearch().search(nums, target));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 9, 4),
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 2, -1),
                Arguments.of(new int[]{5}, 5, 0),
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 12, 5),
                Arguments.of(new int[]{-1, 0, 3, 5, 9, 12}, 13, -1)
        );
    }
}