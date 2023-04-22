package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ValidMountainArrayTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] nums, boolean result) {
        assertEquals(result, new ValidMountainArray().validMountainArray(nums));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 5}, false),
                Arguments.of(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, false),
                Arguments.of(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, false),
                Arguments.of(new int[]{0, 3, 2, 1}, true),
                Arguments.of(new int[]{0, 3, 4, 2, 2, 1}, false),
                Arguments.of(new int[]{1, 3, 2}, true)
        );
    }
}