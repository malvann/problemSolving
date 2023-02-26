package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InputArrayIsSortedTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] nums, int target, int[] result) {
        assertArrayEquals(result, new InputArrayIsSorted().twoSum(nums, target));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 3, 12}, 9, new int[]{1, 2}),
                Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}),
                Arguments.of(new int[]{-1, 0}, -1, new int[]{1, 2}),
                Arguments.of(new int[]{2, 3, 4}, 6, new int[]{1, 3}));
    }
}