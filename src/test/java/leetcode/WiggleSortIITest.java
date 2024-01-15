package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WiggleSortIITest {
    @ParameterizedTest
    @MethodSource
    void test(int[] nums, int[] result) {
        new WiggleSortII().wiggleSort(nums);
        assertEquals(result, nums);
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 4, 3, 4, 1, 2, 1, 3, 1, 3, 2, 3, 3}, new int[]{2, 3, 1, 3, 1, 2}),
                Arguments.of(new int[]{1, 5, 1, 1, 6, 4}, new int[]{1, 4, 1, 5, 1, 6}),
                Arguments.of(new int[]{1, 3, 2, 2, 3, 1}, new int[]{2, 3, 1, 3, 1, 2})
        );
    }
}