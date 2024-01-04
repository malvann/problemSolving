package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VowelSubstringTest {
    @ParameterizedTest
    @MethodSource
    void test(String s, Integer k, String result) {
        assertEquals(result, VowelSubstring.findSubstring(s, k));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("caberqiitefg", 5, "erqii"),
                Arguments.of("azerdii", 5, "erdii"),
                Arguments.of("qwdftr", 2, "Not found!")
        );
    }
}