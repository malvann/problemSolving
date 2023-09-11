package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerOfTwoTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int num, boolean result) {
        assertEquals(result, new PowerOfTwo().isPowerOfTwo(num));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(1, true),
                Arguments.of(16, true),
                Arguments.of(6, false),
                Arguments.of(-2147483648, false),
                Arguments.of(3, false)
        );
    }
}