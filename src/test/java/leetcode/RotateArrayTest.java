package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] nums, int k, int[] result) {
        new RotateArray().rotate(nums, k);
        assertArrayEquals(result, nums);
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
//                Arguments.of(new int[]{1, 2}, 1, new int[]{2, 1}),
                Arguments.of(new int[]{1, 2}, 3, new int[]{2, 1}),
                Arguments.of(new int[]{1}, 0, new int[]{1}),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}));
    }
}