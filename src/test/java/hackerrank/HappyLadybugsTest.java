package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HappyLadybugsTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(String line, String result) {
        assertEquals(result, HappyLadybugs.happyLadybugs(line));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of("_", "YES"),
                Arguments.of("RRGGBBXX", "YES"),
                Arguments.of("RBRB", "NO"),
                Arguments.of("RRRR", "YES"),
                Arguments.of("BBB", "YES"),
                Arguments.of("BBB_", "YES"),
                Arguments.of("RBY_YBR", "YES"),
                Arguments.of("X_Y__X", "NO"),
                Arguments.of("__", "YES"),
                Arguments.of("B_RRBR", "YES")
        );
    }
}