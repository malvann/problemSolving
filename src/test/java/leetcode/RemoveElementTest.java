package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveElementTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] nums, int val, int result, int[] expectedArr) {
        assertEquals(result, new RemoveElement().removeElement(nums, val));
//        assertArrayEquals(expectedArr, Arrays.copyOf(nums, result));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{}, 0, 0, new int[]{}),
                Arguments.of(new int[]{3, 2, 2, 3}, 3, 2, new int[]{2, 2}),
                Arguments.of(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2, 5, new int[]{0, 1, 4, 0, 3})
        );
    }
}