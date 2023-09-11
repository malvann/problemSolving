package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(String target, String source, boolean result) {
        assertEquals(result, new RansomNote().canConstruct(target, source));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of("a", "b", false),
                Arguments.of("aa", "ab", false),
                Arguments.of("aa", "aab", true)
        );
    }
}