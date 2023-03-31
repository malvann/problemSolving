package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixLayerRotationTest {

    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int r, List<List<Integer>> matrix, List<List<Integer>> result) {
        new MatrixLayerRotation().matrixRotation(matrix, r);
        assertEquals(result, matrix);
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(2,
                        new ArrayList<>(List.of(
                                new ArrayList<>(List.of(1, 2, 3, 4)),
                                new ArrayList<>(List.of(12, 1, 2, 5)),
                                new ArrayList<>(List.of(11, 4, 3, 6)),
                                new ArrayList<>(List.of(10, 9, 8, 7)))),
                        new ArrayList<>(List.of(
                                List.of(3, 4, 5, 6),
                                List.of(2, 3, 4, 7),
                                List.of(1, 2, 1, 8),
                                List.of(12, 11, 10, 9)))),
                Arguments.of(7,
                        new ArrayList<>(List.of(
                                new ArrayList<>(List.of(1, 2, 3, 4)),
                                new ArrayList<>(List.of(7, 8, 9, 10)),
                                new ArrayList<>(List.of(13, 14, 15, 16)),
                                new ArrayList<>(List.of(19, 20, 21, 22)),
                                new ArrayList<>(List.of(25, 26, 27, 28)))),
                        new ArrayList<>(List.of(
                                List.of(28, 27, 26, 25),
                                List.of(22, 9, 15, 19),
                                List.of(16, 8, 21, 13),
                                List.of(10, 14, 20, 7),
                                List.of(4, 3, 2, 1)))),
                Arguments.of(3,
                        new ArrayList<>(List.of(
                                new ArrayList<>(List.of(1, 1)),
                                new ArrayList<>(List.of(1, 1)))),
                        new ArrayList<>(List.of(
                                List.of(1, 1),
                                List.of(1, 1))))
        );
    }
}