package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppendAndDeleteTest {
    @ParameterizedTest
    @MethodSource
    void test(String s, String t, int k, String result) {
        assertEquals(result, AppendAndDelete.appendAndDelete(s, t, k));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("abcd", "abcdert", 10, "No"),
                Arguments.of("y", "yu", 2, "No"),
                Arguments.of("zzzzz", "zzzzzzz", 4, "Yes"),
                Arguments.of("hackerhappy", "hackerrank", 9, "Yes"),
                Arguments.of("aba", "aba", 7, "Yes"),
                Arguments.of("ashley", "ash", 2, "No")
        );
    }
}