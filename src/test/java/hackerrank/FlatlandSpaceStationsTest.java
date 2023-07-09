package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class FlatlandSpaceStationsTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int citiesNum, int[] cityIndWithStation, int result) {
        assertEquals(result, FlatlandSpaceStations.flatlandSpaceStations(citiesNum, cityIndWithStation));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(5, new int[]{0, 4}, 2),
                Arguments.of(6, new int[]{0, 1, 2, 4, 3, 5}, 0),
                Arguments.of(20, new int[]{13, 1, 11, 10, 6}, 6)
        );
    }
}