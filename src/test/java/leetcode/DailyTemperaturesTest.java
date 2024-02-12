package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DailyTemperaturesTest {
    @ParameterizedTest
    @MethodSource
    void test(int[] temperatures, int[] result) {
        assertArrayEquals(result, new DailyTemperatures().dailyTemperatures(temperatures));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{34, 80, 80, 80, 34, 80, 80, 80, 34, 34}, new int[]{1, 0, 0, 0, 1, 0, 0, 0, 0, 0}),
                Arguments.of(new int[]{73, 74, 75, 71, 69, 72, 76, 73}, new int[]{1, 1, 4, 2, 1, 1, 0, 0}),
                Arguments.of(new int[]{30, 40, 50, 60}, new int[]{1, 1, 1, 0}),
                Arguments.of(new int[]{30, 60, 90}, new int[]{1, 1, 0})
        );
    }
}