package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsolutePermutationTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int n, int k, List<Integer> result) {
        assertEquals(result, AbsolutePermutation.absolutePermutation(n, k));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(10, 0, List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)),
                Arguments.of(10, 1, List.of(2, 1, 4, 3, 6, 5, 8, 7, 10, 9)),
                Arguments.of(7, 0, List.of(1, 2, 3, 4, 5, 6, 7)),
                Arguments.of(10, 9, List.of(-1)),
                Arguments.of(9, 0, List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)),
                Arguments.of(10, 3, List.of(-1)),
                Arguments.of(8, 2, List.of(3, 4, 1, 2, 7, 8, 5, 6)),
                Arguments.of(8, 0, List.of(1, 2, 3, 4, 5, 6, 7, 8)),
                Arguments.of(7, 0, List.of(1, 2, 3, 4, 5, 6, 7)),
                Arguments.of(10, 1, List.of(2, 1, 4, 3, 6, 5, 8, 7, 10, 9)),

                Arguments.of(2, 1, List.of(2, 1)),
                Arguments.of(10, 5, List.of(6, 7, 8, 9, 10, 1, 2, 3, 4, 5)),
                Arguments.of(7, 5, List.of(-1)),
                Arguments.of(2, 1, List.of(2, 1)),
                Arguments.of(2, 0, List.of(1, 2)),
                Arguments.of(2, 0, List.of(1, 2)),
                Arguments.of(1, 0, List.of(1)),
                Arguments.of(10, 5, List.of(6, 7, 8, 9, 10, 1, 2, 3, 4, 5)),
                Arguments.of(10, 0, List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)),
                Arguments.of(6, 0, List.of(1, 2, 3, 4, 5, 6)),

                Arguments.of(2, 1, List.of(2, 1)),
                Arguments.of(3, 0, List.of(1, 2, 3)),
                Arguments.of(3, 2, List.of(-1)));
    }
}