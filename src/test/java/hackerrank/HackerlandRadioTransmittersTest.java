package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HackerlandRadioTransmittersTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(int transmitterRange, List<Integer> housesLocation, int result) {
        assertEquals(result, HackerlandRadioTransmitters.hackerlandRadioTransmitters(housesLocation, transmitterRange));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(1, new ArrayList<>(List.of(1, 2, 3, 5, 9)), 3),
                Arguments.of(2, new ArrayList<>(List.of(7, 2, 4, 6, 5, 9, 12, 11)), 3),
                Arguments.of(1, new ArrayList<>(List.of(1, 1)), 1)
        );
    }
}
