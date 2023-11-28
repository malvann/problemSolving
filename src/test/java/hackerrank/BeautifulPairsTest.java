package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BeautifulPairsTest {
    @ParameterizedTest
    @MethodSource
    void test(List<Integer> aList, List<Integer> bList, int result) {
        assertEquals(result, BeautifulPairs.beautifulPairs(aList, bList));
    }

    private static Stream<Arguments> test() {
        return Stream.of(
                Arguments.of(List.of(1), List.of(1), 0),
                Arguments.of(List.of(1), List.of(2), 1),
                Arguments.of(Arrays.asList(1,2,3), Arrays.asList(1,2,3), 3),
                Arguments.of(Arrays.asList(1,2,3), Arrays.asList(4,5,6), 1),
                Arguments.of(Arrays.asList(1,2,3,6), Arrays.asList(2,4,1,6), 4),
                Arguments.of(Arrays.asList(1,2,3,4,7,8,11,12), Arrays.asList(1,1,4,6,6,9,9,11), 4)
        );
    }
}