package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedStringTest {
    @ParameterizedTest
    @MethodSource
    void test(String s, long n, long expected) {
        assertEquals(expected, RepeatedString.repeatedString(s, n));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("ababa", 3L, 2L),
                Arguments.of("aba", 10L, 7L),
                Arguments.of("aba", 1L, 1L),
                Arguments.of("a", 1000000000000L, 1000000000000L)
        );
    }
}