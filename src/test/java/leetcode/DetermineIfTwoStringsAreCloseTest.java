package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DetermineIfTwoStringsAreCloseTest {
    @ParameterizedTest
    @MethodSource
    void test(String w1, String w2, boolean result) {
        assertEquals(result, new DetermineIfTwoStringsAreClose().closeStrings(w1, w2));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("a", "b", false),
                Arguments.of("abbzzca", "babzzcz", false),
                Arguments.of("uau", "ssx", false),
                Arguments.of("cabbba", "aabbss", false),
                Arguments.of("abc", "bca", true),
                Arguments.of("a", "aa", false),
                Arguments.of("cabbba", "abbccc", true)
        );
    }
}