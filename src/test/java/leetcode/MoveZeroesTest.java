package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoveZeroesTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] nums, int[] result) {
        new MoveZeroes().moveZeroes(nums);
        assertArrayEquals(result, nums);
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{1,}, new int[]{1}),
                Arguments.of(new int[]{1, 3, 0, 0, 12}, new int[]{1, 3, 12, 0, 0}),
                Arguments.of(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}));
    }
}