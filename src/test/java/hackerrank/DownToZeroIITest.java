package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DownToZeroIITest {
    @ParameterizedTest
    @MethodSource
    void test(int n, int result) {
        assertEquals(result, DownToZeroII.downToZero(n));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(4, 3),
                Arguments.of(3, 3),
                Arguments.of(966514, 8),
                Arguments.of(812849, 10),
                Arguments.of(808707, 8),
                Arguments.of(360422, 11),
                Arguments.of(691410, 9),
                Arguments.of(691343, 11),
                Arguments.of(551065, 9)

        );
    }
}