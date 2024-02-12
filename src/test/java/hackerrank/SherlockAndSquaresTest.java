package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SherlockAndSquaresTest {
    @ParameterizedTest
    @MethodSource
    void test(int s, int t, int result) {
        assertEquals(result, SherlockAndSquares.squares(s, t));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(465868129, 988379794, 9855),
                Arguments.of(3, 9, 2),
                Arguments.of(17, 24, 0)
        );
    }
}