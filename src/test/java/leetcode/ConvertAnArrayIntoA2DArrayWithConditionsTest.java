package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConvertAnArrayIntoA2DArrayWithConditionsTest {
    @ParameterizedTest
    @MethodSource
    void test(int[] num, List<List<Integer>> expected) {
        assertEquals(expected, new ConvertAnArrayIntoA2DArrayWithConditions().findMatrix(num));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(new int[]{1, 3, 4, 1, 2, 3, 1}, List.of(List.of(1, 3, 4, 2), List.of(1, 3), List.of(1))),
                Arguments.of(new int[]{1, 2, 3, 4}, List.of(List.of(1, 2, 3, 4)))
        );
    }
}