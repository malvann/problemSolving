package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThirdMaximumNumberTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] arr, int result) {
        assertEquals(result, new ThirdMaximumNumber().thirdMax(arr));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, 2),
                Arguments.of(new int[]{-2147483648, 1, 1}, 1),
                Arguments.of(new int[]{2, 2, 3, 1}, 1),
                Arguments.of(new int[]{3, 2, 1}, 1),
                Arguments.of(new int[]{1, 2}, 2)
        );
    }
}