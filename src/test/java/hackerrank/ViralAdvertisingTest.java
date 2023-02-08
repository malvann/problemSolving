package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ViralAdvertisingTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int day, int result) {
        assertEquals(result, ViralAdvertising.viralAdvertising(day));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(Arguments.of(5, 24), Arguments.of(3, 9));
    }
}