package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(String s, int result) {
        assertEquals(result, new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of("dvdf", 3),
                Arguments.of("", 0),
                Arguments.of("a", 1),
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3));
    }
}