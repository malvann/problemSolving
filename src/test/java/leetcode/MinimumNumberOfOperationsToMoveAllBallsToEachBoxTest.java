package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberOfOperationsToMoveAllBallsToEachBoxTest {
    @ParameterizedTest
    @MethodSource
    void test(String boxes, int[] result) {
        assertEquals(Arrays.toString(result), Arrays.toString(new MinimumNumberOfOperationsToMoveAllBallsToEachBox().minOperations(boxes)));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of("110", new int[]{1, 1, 3}),
                Arguments.of("001011", new int[]{11, 8, 5, 4, 3, 4})
        );
    }
}