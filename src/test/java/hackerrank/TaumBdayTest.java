package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaumBdayTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int b, int w, int bc, int wc, int z, int result) {
        assertEquals(result, TaumBday.taumBday(b, w, bc, wc, z));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(10, 10, 1, 1, 1, 20),
                Arguments.of(3, 5, 3, 4, 1, 29));
    }
}