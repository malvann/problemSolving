package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestIncreasingSubsequenceTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] nums, int result) {
        assertEquals(result, new LongestIncreasingSubsequence().lengthOfLIS(nums));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 6, 7, 9, 4, 10, 5, 6}, 6),
                Arguments.of(new int[]{3, 2, 1}, 1),
                Arguments.of(new int[]{10, 9, 2, 5, 3, 7, 101, 18}, 4),
                Arguments.of(new int[]{0, 1, 0, 3, 2, 3}, 4),
                Arguments.of(new int[]{7, 7, 7, 7, 7, 7, 7}, 1)
        );
    }
}
