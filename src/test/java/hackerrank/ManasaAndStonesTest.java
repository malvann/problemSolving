package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ManasaAndStonesTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int n, int a, int b, List<Integer> result) {
        assertEquals(result, ManasaAndStones.stones(n, a, b));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(18, 28, 28, List.of(476)),
                Arguments.of(3, 1, 2, List.of(2, 3, 4)),
                Arguments.of(4, 10, 100, List.of(30, 120, 210, 300)));
    }
}