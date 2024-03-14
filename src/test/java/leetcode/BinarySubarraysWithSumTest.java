package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySubarraysWithSumTest {

    @ParameterizedTest
    @MethodSource
    void test(int[] nums, int target, int result) {
        assertEquals(result, new BinarySubarraysWithSum().numSubarraysWithSum(nums, target));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1}, 1, 1),
                Arguments.of(new int[]{1, 0, 1, 0, 1}, 2, 4),
                Arguments.of(new int[]{0, 0, 0, 0, 0}, 0, 15)
        );
    }
}