package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetermineifStringHalvesAreAlikeTest {
    @ParameterizedTest
    @MethodSource
    void test(String s, boolean result) {
        assertEquals(result, new DetermineifStringHalvesAreAlike().halvesAreAlike(s));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("book", true),
                Arguments.of("textbook", false)
        );
    }
}