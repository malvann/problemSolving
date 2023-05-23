package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClosestNumbersTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(List<Integer> arr, List<Integer> result) {
        assertEquals(result, ClosestNumbers.closestNumbers(arr));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854)),
                        List.of(-20, 30)),
                Arguments.of(new ArrayList<>(List.of(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470)),
                        List.of(-520, -470, -20, 30)),
                Arguments.of(new ArrayList<>(List.of(5, 4, 3, 2)),
                        List.of(2, 3, 3, 4, 4, 5))
        );
    }
}