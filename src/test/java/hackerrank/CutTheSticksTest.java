package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CutTheSticksTest {
    @ParameterizedTest
    @MethodSource
    void test(List<Integer> nums, List<Integer> result) {
        assertEquals(result, CutTheSticks.cutTheSticks(nums));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(List.of(1, 2, 3, 4, 3, 3, 2, 1), List.of(8,6,4,1))
        );
    }
}