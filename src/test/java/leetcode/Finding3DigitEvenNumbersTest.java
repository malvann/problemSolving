package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Finding3DigitEvenNumbersTest {
    @ParameterizedTest
    @MethodSource
    void test(int[] digits, int[] result) {
        assertEquals(Arrays.toString(result), Arrays.toString(new Finding3DigitEvenNumbers().findEvenNumbers(digits)));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{2, 1, 3, 0}, new int[]{102, 120, 130, 132, 210, 230, 302, 310, 312, 320}),
                Arguments.of(new int[]{2, 2, 8, 8, 2}, new int[]{222, 228, 282, 288, 822, 828, 882}),
                Arguments.of(new int[]{3, 7, 5}, new int[]{})
                );
    }
}
