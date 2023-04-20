package leetcode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DuplicateZerosTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int[] grid, int[] result) {
        new DuplicateZeros().duplicateZeros(grid);
        assertArrayEquals(result, grid);
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(
                        new int[]{1, 0, 2, 3, 0, 4, 5, 0},
                        new int[]{1, 0, 0, 2, 3, 0, 0, 4}),
                Arguments.of(
                        new int[]{0, 0, 0, 0, 0, 0, 0},
                        new int[]{0, 0, 0, 0, 0, 0, 0})
        );
    }
}