package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindThePivotIntegerTest {
    @ParameterizedTest
    @MethodSource
    void test(int n, int result) {
        assertEquals(result, new FindThePivotInteger().pivotInteger(n));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(8, 6),
                Arguments.of(1, 1),
                Arguments.of(4, -1)
        );
    }
}