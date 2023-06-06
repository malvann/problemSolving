package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindTheMedianTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(List<Integer> arr, int result) {
        assertEquals(result, FindTheMedian.findMedian(arr));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(5, 3, 1, 2, 4)), 3),
                Arguments.of(new ArrayList<>(List.of(0, 1, 2, 4, 6, 5, 3)), 3)
        );
    }
}