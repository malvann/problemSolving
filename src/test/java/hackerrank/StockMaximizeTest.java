package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StockMaximizeTest {
    @ParameterizedTest
    @MethodSource
    void test(List<Integer> nums, long result) {
        assertEquals(result, StockMaximize.stockmax(nums));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(List.of(1, 2), 1),
                Arguments.of(List.of(2, 1), 0),
                Arguments.of(List.of(5, 3, 2), 0),
                Arguments.of(List.of(1, 2, 100), 197),
                Arguments.of(List.of(1, 3, 1, 2), 3),
                Arguments.of(List.of(1, 2, 3, 1, 10), 33)
        );
    }
}