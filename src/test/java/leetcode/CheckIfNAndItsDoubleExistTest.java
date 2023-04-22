package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckIfNAndItsDoubleExistTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] nums, boolean result) {
        assertEquals(result, new CheckIfNAndItsDoubleExist().checkIfExist(nums));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{10, 2, 5, 3}, true),
                Arguments.of(new int[]{3, 1, 7, 11}, false)
        );
    }
}