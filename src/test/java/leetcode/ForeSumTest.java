package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ForeSumTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] nums, int target, List<List<Integer>> expected) {
        List<List<Integer>> res = new ForeSum().fourSum(nums, target);
        assertEquals(expected.size(), res.size());
        assertTrue(expected.containsAll(res));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(
                        new int[]{1000000000, 1000000000, 1000000000, 1000000000}, -294967296,
                        List.of()),
                Arguments.of(
                        new int[]{1, -2, -5, -4, -3, 3, 3, 5}, -11,
                        List.of(List.of(-5, -4, -3, 1))),
                Arguments.of(
                        new int[]{0, 0, 0, 0}, 0,
                        List.of(List.of(0, 0, 0, 0))),
                Arguments.of(
                        new int[]{1, 0, -1, 0, -2, 2}, 0,
                        List.of(List.of(-2, -1, 1, 2), List.of(-2, 0, 0, 2), List.of(-1, 0, 0, 1))),
                Arguments.of(
                        new int[]{2, 2, 2, 2, 2}, 8,
                        List.of(List.of(2, 2, 2, 2)))
        );
    }
}