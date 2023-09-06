package hackerrank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BigSortingTest {
    @ParameterizedTest
    @MethodSource(value = "generateSource")
    void test(List<String> unsorted, List<String> result) {
        assertEquals(result, BigSorting.bigSorting(unsorted));
    }

    private static Stream<Arguments> generateSource() {
        return Stream.of(
                Arguments.of(
                        new ArrayList<>(List.of("31415926535897932384626433832795", "1", "3", "10", "3", "5")),
                        new ArrayList<>(List.of("1", "3", "3", "5", "10", "31415926535897932384626433832795"))),
                Arguments.of(
                        new ArrayList<>(List.of("1", "2", "100", "12303479849857341718340192371", "3084193741082937", "3084193741082938", "111", "200")),
                        new ArrayList<>(List.of("1", "2", "100", "111", "200", "3084193741082937", "3084193741082938", "12303479849857341718340192371"))
                )
        );
    }
}