package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindDigitsTest {

    @ParameterizedTest
    @MethodSource
    void test(int n, int result) {
        assertEquals(result, FindDigits.findDigits(n));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(12, 2),
                Arguments.of(1012, 3)
        );
    }
}