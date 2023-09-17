package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonSubsequenceTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(String s1, String s2, int result) {
        assertEquals(result, new LongestCommonSubsequence().longestCommonSubsequence(s1, s2));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of("oxcpqrsvwf", "shmtulqrypy", 2),
                Arguments.of("ezupkr", "ubmrapg", 2),
                Arguments.of("abcde", "ace", 3),
                Arguments.of("abc", "abc", 3),
                Arguments.of("abc", "def", 0)
        );
    }
}