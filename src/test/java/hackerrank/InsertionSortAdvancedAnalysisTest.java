package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InsertionSortAdvancedAnalysisTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(List<Integer> grid, int result) {
        assertEquals(result, new InsertionSortAdvancedAnalysis().insertionSort(grid));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(3, 5, 7, 11, 9)), 1),
                Arguments.of(new ArrayList<>(List.of(12, 15, 1, 5, 6, 14, 11)), 10),
                Arguments.of(new ArrayList<>(List.of(2, 1, 3, 1, 2)), 4),
                Arguments.of(new ArrayList<>(List.of(1, 1, 1, 2, 2)), 0)
        );
    }
}