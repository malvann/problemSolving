package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesFromSortedArrayTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] nums, int result, int[] expectedArr) {
        assertEquals(result, new RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
        assertArrayEquals(expectedArr, nums);
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 5, new int[]{0, 1, 2, 3, 4, 2, 2, 3, 3, 4})
        );
    }
}